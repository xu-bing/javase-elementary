package com.socket2;

import com.util.MessageReadThread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GuiServer {
    private JFrame f = new JFrame("server");
    private JPanel p = new JPanel();

    private JTextArea receiveTextArea = new JTextArea(5,30);
    private JTextArea sendTextArea = new JTextArea(5, 30);

    private JButton sendButton = new JButton("Send");


    private ServerSocket server;
    private Socket socket;


    public GuiServer() {

        try {
            server = new ServerSocket(9999);

            // 反复接收客户端连接（死循环）

        } catch (IOException e) {
            e.printStackTrace();
        }

        init();
    }  // GuiServer

    public void init(){
        sendButton.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {

            }
        });


        p.add(receiveTextArea);
        p.add(sendTextArea);
        p.add(sendButton);

        f.add(p);

        f.setSize(250, 250);
        f.setVisible(true);
    }  // init

    /**
     *
     */
    public class ConnectionAcceptThread extends Thread{
        @Override
        public void run() {
            while(true){

                try {
                    socket = server.accept();

                    // 连接
//                    MessageReadThread t = new MessageReadThread();
//                    t.start();

                } catch (IOException e) {
                    e.printStackTrace();
                }   // try ... catch


            }  // while
        }    // run
    }

    public static void main(String[] args) {
        new GuiServer();
    }
}
