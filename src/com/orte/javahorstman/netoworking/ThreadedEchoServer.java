package com.orte.javahorstman.netoworking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ThreadedEchoServer {
    public static void main(String[] args) {
        try (ServerSocket s = new ServerSocket(8189)) {
            int i = 1;
            while (true){
                Socket incoming = s.accept();
                System.out.println("Spawning " + i);
                Runnable r = new ThreadedEchoHandler(incoming);
                Thread t = new Thread(r);
                t.start();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class ThreadedEchoHandler implements Runnable {
    private Socket incoming;

    public ThreadedEchoHandler(Socket incoming) {
        this.incoming = incoming;
    }

    @Override
    public void run() {
        try (InputStream inputStream= incoming.getInputStream();
             OutputStream outputStream = incoming.getOutputStream()) {
            Scanner in = new Scanner(inputStream, "UTF-8");
            PrintWriter out = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"), true);
            out.println("Hello! Enter BYE to exit.");
            boolean done = false;
            while (!done&&in.hasNextLine()){
                String line = in.nextLine();
                out.println("Echo: " + line);
                if(line.trim().equals("BYE")){
                    done = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}