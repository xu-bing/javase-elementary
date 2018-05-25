package com.util;

import com.domain.Message;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Date;

public class MessageReadThread extends Thread {

    private Socket socket;
    private JTextArea receiveTextArea;

    public MessageReadThread(Socket socket, JTextArea receiveTextArea) {
        this.socket = socket;
        this.receiveTextArea = receiveTextArea;
    }

    @Override
    public void run() {
        while (true){
            try {
                // 1. 从Socket中获得inputstram
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

                // 2. 再读消息
                Message message = (Message) ois.readObject();
//                String message = (String) ois.readObject();
                System.out.println("server read:::" + message);

                // 获得远端的IP地址和端口号
                InetSocketAddress add = (InetSocketAddress) socket.getRemoteSocketAddress();
                String ip = add.getAddress().getHostAddress();
                int port = add.getPort();

                Date d = new Date();

                // 3. 将消息显示在消息框中
                receiveTextArea.append(ip + ":::" + port + ":::" + d.toString() + ":::" + message.getMsg() + "\n");
//                receiveTextArea.append(ip + ":::" + port + ":::" + d.toString() + ":::" + message);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        }  // while
    }  // run
}
