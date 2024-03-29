package com.orte.javaalishev.multythreading;

import java.util.LinkedList;
import java.util.Queue;

public class CustomProducerConsumer {

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumerCus pcs = new ProducerConsumerCus();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pcs.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pcs.consume();
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

class ProducerConsumerCus {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();
    public void produce() throws InterruptedException {
        int value = 0;
       while(true){
           synchronized (lock){
               while(queue.size() == LIMIT){
                   lock.wait();
               }
                queue.offer(value++);
                lock.notify();
           }
       }
    }
    public void consume() throws InterruptedException {
        while (true){
            synchronized (lock){
                while (queue.size() == 0){
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size is " + queue.size());
                lock.notify();
            }
            Thread.sleep(1000);
        }
    }
}