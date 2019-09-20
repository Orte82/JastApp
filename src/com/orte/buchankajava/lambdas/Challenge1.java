package com.orte.buchankajava.lambdas;

public class Challenge1 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            String[] strings = "Let's split this up into an array".split(" ");
            for (String string : strings) {
                System.out.println(string);
            }
        };
        runnable.run();
    }

}
