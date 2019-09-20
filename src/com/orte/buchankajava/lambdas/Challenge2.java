package com.orte.buchankajava.lambdas;

import java.util.function.UnaryOperator;

public class Challenge2 {
    public static void main(String[] args) {
        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 0) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondChar.apply("Hello"));
    }
}
