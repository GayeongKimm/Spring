package chapter03.use;

import chapter03.used.SubCalc;
import chapter03.used.Calculator;

public class Call {
    public static void main(String[] args) {
        Calculator calculator = new SubCalc();
        Integer result = calculator.calc(10, 5);
        System.out.println("계산결과 : (" + result + ")");
    }
}
