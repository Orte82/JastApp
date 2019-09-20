package com.orte.boostbrain.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {
    public static void main(String[] args) {
        Ticker first = new Ticker("First");
        Ticker second = new Ticker("Second");
//        first.run();
//        second.run();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(first);
        executorService.submit(second);

    }
}
