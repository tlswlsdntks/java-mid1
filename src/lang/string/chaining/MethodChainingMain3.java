package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        /**
         * StringBuilder는 메서드 체이닝 기법을 제공한다.
         * @Override
         * public StringBuilder append(CharSequence s) {
         *      super.append(s);
         *      return this;
         * }
         */
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue(); //메서드 체이닝
        System.out.println("result = " + result);
    }
}
