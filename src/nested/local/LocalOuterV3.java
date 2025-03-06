package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstnaceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; //1. 지역변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                //인스턴스 변수
                System.out.println("value = " + value);
                //지역 변수 캡쳐
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                //외부 클래스 변수
                System.out.println("outInstnaceVar = " + outInstnaceVar);
            }
        }

        return new LocalPrinter(); //2. new LocalPrinter().print() 를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
    }

    public static void main(String[] args) {
        Printer printer = new LocalOuterV3().process(2);
        printer.print(); //3. printer.print() 를 new LocalOuterV3().process(2) 의 스택 프레임이 사라진 이후에 실행시킨다.

        //4. 캡처된 변수가 출력된다.
        /**
         * 변수 캡처
         * 자바가 지역 클래스의 인스턴스를 생성하는 시점에 필요한 지역 변수를 복사하여 저장하는 과정이다.
         * 물론 모든 지역 변수를 캡처하는 것이 아니라, 접근이 필요한 지역 변수만을 캡처한다.
         * 1. 인스턴스 변수
         *      field = int nested.local.LocalOuterV3$1LocalPrinter.value
         * 2. 지역 변수 캡쳐
         *      field = final int nested.local.LocalOuterV3$1LocalPrinter.val$localVar
         *      field = final int nested.local.LocalOuterV3$1LocalPrinter.val$paramVar
         * 3. 외부 클래스 변수
         *      field = final nested.local.LocalOuterV3 nested.local.LocalOuterV3$1LocalPrinter.this$0
         */
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
