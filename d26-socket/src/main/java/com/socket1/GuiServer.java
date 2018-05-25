package com.socket1;

import com.domain.Message;
import com.util.MessageReadThread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GuiServer {
    private JFrame f = new JFrame("server");
    private JPanel p = new JPanel();

    private JTextArea receiveTextArea = new JTextArea(5,30);
    private JTextArea sendTextArea = new JTextArea(5, 30);

    private JButton sendButton = new JButton("Send");


    private ServerSocket server;
    private Socket socket;


    private Map<Integer, Socket> socketMap = new HashMap<Integer, Socket>();


    public GuiServer() {
        System.out.println("------");

        try {
            server = new ServerSocket(9999);

            /*// 1. socket只存第1个客户端
            socket = server.accept();

            MessageReadThread t = new MessageReadThread(socket, receiveTextArea);
            t.start();
            // => 1对1：ok, 再开1个client，服务器不会收到消息*/

            // 2. socket只存最后1个客户端
            // 反复接收客户端连接（死循环）
            new ConnectionAcceptThread().start();

        } catch (IOException e) {
            e.printStackTrace();
        }

        init();

        System.out.println("=============");
    }  // GuiServer

    public void init(){
        sendButton.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                String msg = sendTextArea.getText();
                /*String[] msgs = msg.split(":");

                Message message = new Message();
                message.setMsg(msgs[1]);

                int port = Integer.parseInt(msgs[0]);*/

                Message message = new Message();
                message.setMsg(msg);

                try {
                    // 只能向最后连接的客户端发送消息
                    /*ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message);
                    oos.flush();*/

//                    ObjectOutputStream oos = new ObjectOutputStream(socketMap.get(port).getOutputStream());

                    // group chat
                    Set entrySet = socketMap.entrySet();

                    Iterator entries =  entrySet.iterator();
                    while(entries.hasNext()){
                        Map.Entry entry = (Map.Entry) entries.next();

                        Socket socket = (Socket) entry.getValue();
                        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                        oos.writeObject(message);
                        oos.flush();
                    }


                    sendTextArea.setText("");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

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
                    // 1. 获得socket
                    socket = server.accept();

                    InetSocketAddress add = (InetSocketAddress) socket.getRemoteSocketAddress();
                    int port = add.getPort();

                    // 将socket保存进socketMap(port:socket)
                    socketMap.put(port, socket);

                    // 2. 从socket中获得stream, 通过stream将读取消息
                    MessageReadThread t = new MessageReadThread(socket, receiveTextArea);
                    t.start();




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
