package binaryoperatorclassexamples;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b) -> a + b;

        System.out.println(binaryOperator.apply(10, 10));
    }
}
