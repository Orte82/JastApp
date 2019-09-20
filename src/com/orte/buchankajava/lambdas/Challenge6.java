package com.orte.buchankajava.lambdas;

import java.util.function.Supplier;

public class Challenge6 {
    public static void main(String[] args) {
        // Supplier<String> iLoveJava = () -> "I love Java!";
        Supplier<String> iLoveJava = () -> {
            return "I love Java!";
        };
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }
}
