package com.orte.buchankajava.multithreading.threads;

public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("Another Thread");
        anotherThread.start(); // if to use .run() => thread will be running in main thread
        new Thread(){
            public void run(){
                System.out.println(ThreadColor.ANSI_GREEN + "Hello form anonymous class thread");
            }
        }.start();
        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED + "Hello from the MyRunnable class's implementation of .run()");
                try {
                    anotherThread.join();
                    System.out.println(ThreadColor.ANSI_RED + anotherThread.getName() +" terminated");
                } catch (InterruptedException e) {
                    System.out.println(ThreadColor.ANSI_RED + "I couldn't wait after all. I was interrupted for some reason");
                }
                //System.out.println(ThreadColor.ANSI_RED + "Back in black");
            }
        });
        myRunnableThread.start();
       // anotherThread.interrupt();

        System.out.println(ThreadColor.ANSI_PURPLE + "Hello again from main thread");

//        anotherThread.start(); // will be exception
    }
}
