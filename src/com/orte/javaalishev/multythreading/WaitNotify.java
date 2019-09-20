package com.orte.javaalishev.multythreading;

import java.util.Scanner;

public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumerCus wn = new ProducerConsumerCus();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
class WaitAndNotify{
    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread started...");
            wait(); // inside synchronized block equivalent this.wait();
            System.out.println("Producer thread resumed...");
            // when wait() called:
            // 1. intrinsic lock is given away
            // 2. we are waiting for notify() on this object
        }
    }
    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);
        synchronized (this){
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify(); // awakes one thread
            //notifyAll(); //awakes all threads
            Thread.sleep(5000);
        }
    }
}