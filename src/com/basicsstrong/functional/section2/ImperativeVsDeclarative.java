package com.basicsstrong.functional.section2;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {
        // Imperative
        int sumOfEvens = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEvens += i;
            }
        }
        System.out.println(sumOfEvens);

        // Declarative or Functional
        sumOfEvens = IntStream.rangeClosed(0, 100)
                .filter(x -> x % 2 == 0)
                .reduce((x, y) -> x + y)
                .getAsInt();

        System.out.println(sumOfEvens);

        // We saw how imperative style and declarative style are different
        // and the benefits of declarative style over imperative style
        // like the declarative or functional style is much more redeable and
        // concise than imperative style  and declarative or functional style
        // do much better in multi-threaded environment than imperative style

    }
}
