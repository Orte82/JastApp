package com.orte.boostbrain.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ticker implements Runnable{
    private final String name;

    public Ticker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try{for (int i = 0; i < 10; i++) {
            System.out.println(name+" " + i);
            Thread.sleep(1000);
        }}catch(InterruptedException e){
            Logger.getLogger(Ticker.class.getName()).log(Level.SEVERE, "Thread interrupted");
        }

    }
}
