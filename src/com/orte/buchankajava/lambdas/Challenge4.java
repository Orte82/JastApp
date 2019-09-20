package com.orte.buchankajava.lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Challenge4 {
    public static <T, R> void executeMethod(Function<T, R> function, T argument){
        System.out.println(function.apply(argument));
        // challenge 6
        System.out.println(Challenge4.everySecondChar(everySecondChar, "0987654321"));
    }
   private static UnaryOperator<String> everySecondChar = source -> {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 0) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    };
    public static void main(String[] args) {
     Challenge4.executeMethod(everySecondChar, "1234567890");
    }
    public static String everySecondChar(Function<String, String> func, String arg){
        return func.apply(arg);
    }
}
