package nested.inner;

public class ShadowingMain {
    public int value = 1;
    class Inner {
        public int value = 2;
        void go() {
            int value = 3;
            System.out.println("value = " + value); //지역 변수
            System.out.println("this.value = " + this.value); //인스턴스 변수
            System.out.println("ShadowingMain.this = " + ShadowingMain.this.value); //바깥 클래스 변수
            /**
             * 이렇게 이름이 같은 경우 처음부터 이름을 서로 다르게 지어서 명확성을 구분하는 것이 더 나은 방법이다.
             */
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
