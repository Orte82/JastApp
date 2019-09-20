package com.orte.buchankajava.multithreading.producerconsumer;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] messages = {"Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the King's horses and all the King's men",
                "Couldn't put Humpty together again "};
        Random random = new Random();
        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        message.write("Finished");
    }
}
class Reader implements Runnable{
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (String lastMessage = message.read(); !lastMessage.equals("Finished"); lastMessage = message.read() ){
            System.out.println(lastMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
