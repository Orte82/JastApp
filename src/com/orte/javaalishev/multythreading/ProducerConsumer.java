package com.orte.javaalishev.multythreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    public static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            try {
                produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
    }

    private static void produce() throws InterruptedException {
        Random random = new Random(100);
        while (true) {
            queue.put(random.nextInt(100));
        }
    }

    private static void consume() throws InterruptedException {
        Random random = new Random();
        while (true) {
            Thread.sleep(100);
            if (random.nextInt(10) == 5) {
                System.out.println(queue.take());
                System.out.println("Queue size:" + queue.size());
            }
        }
    }
}
