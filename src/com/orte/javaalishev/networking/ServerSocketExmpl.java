package com.orte.javaalishev.networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketExmpl {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            Socket socket = serverSocket.accept();
            //InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(socket.getInputStream());
            // OutputStream outputStream = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            //writer.println("Hello from server");
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                writer.println("You have send: " + str);
                System.out.println(str);
                if (str.equals("exit")) {break;}
            }
        } catch (IOException e) {
            System.out.println("Wrong data");
        }
    }
}
