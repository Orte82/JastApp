package com.orte.buchankajava.multithreading.threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_RED +"Hello form MyRunnable implementation");
    }
}

