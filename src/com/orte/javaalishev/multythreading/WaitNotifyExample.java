package com.orte.javaalishev.multythreading;

import java.util.*;

public class WaitNotifyExample {

    private final static List<String> string = Collections.synchronizedList(new ArrayList<>());
    public static void main(String[] args) {
        new Operator().start();
        new Machine().start();

    }
    static class Operator extends Thread{
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (true){
                synchronized (string){
                    string.add(scanner.nextLine());
                    string.notify();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class Machine extends Thread{
        @Override
        public void run() {
            while(string.isEmpty()){
                synchronized (string){
                    try {
                        string.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(string.remove(0));
                }
            }
        }
    }

}
