package com.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 9999);

//            PrintStream ps = new PrintStream(socket.getOutputStream());
//            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            Scanner sc = new Scanner(System.in);


            while(true){
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

                System.out.println("client write...");

                String response = sc.nextLine();  // blocked
                oos.writeObject(response);
                oos.flush();

//                String line = br.readLine();  // blocked
//                System.out.println("client br read::" + line);

                try {
                    String line = (String) ois.readObject();
                    System.out.println(line);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }


            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }  // main

}
