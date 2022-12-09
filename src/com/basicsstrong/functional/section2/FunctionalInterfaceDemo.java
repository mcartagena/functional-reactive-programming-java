package com.basicsstrong.functional.section2;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        MyFunInterface fun = () -> System.out.println("Hello");
        fun.MyMethod(); // this is analogous to a variable assigment

        // so after java 8 we can assume functions as they are variable assigments

        // something more interesting is that lambdas are very useful in supplying
        // the functionality on the fly
        onTheFly(()-> System.out.println("Hello, on the fly..."));
    }

    public static void onTheFly(MyFunInterface fun){
        fun.MyMethod();
    }
}
