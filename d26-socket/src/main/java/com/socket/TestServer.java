package com.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);

            Socket socket = serverSocket.accept();

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            Scanner sc = new Scanner(System.in);

            System.out.println("server........");

            while (true){
                System.out.println("server read....");
                String line = br.readLine();
                System.out.println(line);

                String response = sc.nextLine();
                bw.write(response);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }  // main
}
