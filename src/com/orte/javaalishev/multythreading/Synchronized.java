package com.orte.javaalishev.multythreading;

public class Synchronized {
    private  int counter;
    public static void main(String[] args) throws InterruptedException {
        Synchronized synchronized3 = new Synchronized();
        synchronized3.doWork();
    }
    // only one thread can access body of method with synchronized
//    public synchronized void increment(){
//        counter++;
//    }
    public void increment(){
      synchronized (this){ // synchronized block
          counter++;
      }

    }
    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                   increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}
