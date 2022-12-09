package com.basicsstrong.functional.section2;

public class LambdaPractice2 {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> System.out.println(a + b);
        add.operation(10, 20);

        MathOperation multiply = (a, b) -> System.out.println(a * b);
        multiply.operation(10, 90);

        // this was an example of lambda for parameterized functions
        // without any return value
    }
}
