package com.basicsstrong.functional.section2;

public class LambdaPractice1 {
    public static void main(String[] args) {
        Name name = () -> System.out.printf("Marcelo");
        name.myName();

        // here in this example we saw functional interface
        // or lambda that was having no return type and no parameter

    }
}
