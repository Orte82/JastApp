package com.orte.javaalishev.networking;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketExmpl {
    public static void main(String[] args) {
        try(Socket socket = new Socket();) {
            socket.connect(new InetSocketAddress("localhost", 8189), 2000);
             Scanner scanner = new Scanner(socket.getInputStream());
             while(scanner.hasNextLine()){
                 System.out.println(scanner.nextLine());
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
