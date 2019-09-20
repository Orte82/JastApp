package com.orte.javaalishev.multythreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DownLatchTest {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 3; i++){
            executorService.submit(new Processor(i, countDownLatch));
        }
        executorService.shutdown();
//        try {
//            countDownLatch.await();
//            System.out.println("Latch has been opened, main thread is proceeding!");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for (int i = 0; i <3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();

        }
    }
}
class Processor implements Runnable{
    private int id ;
    private CountDownLatch countDownLatch;
    public Processor(int id, CountDownLatch countDownLatch){
        this.countDownLatch =countDownLatch;
        this.id = id;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       // countDownLatch.countDown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread with id " + id + " proceeded.");
    }
}