package com.orte.buchankajava.multithreading.counter;

public class Main {
    public static void main(String[] args) {
        Countdown countdown1 = new Countdown();

        CoutndownThread t1 = new CoutndownThread(countdown1);
        t1.setName("Thread 1");
        CoutndownThread t2 = new CoutndownThread(countdown1);
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }

}

class Countdown {
    private int i;

    public synchronized void doCountdown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;

            default:
                color = ThreadColor.ANSI_GREEN;
        }
//        synchronized (this){
        for (i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
        }//}
    }
}

class CoutndownThread extends Thread {
    private Countdown threadCountdown;

    public CoutndownThread(Countdown threadCountdown) {
        this.threadCountdown = threadCountdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}