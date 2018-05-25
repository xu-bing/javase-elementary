package com.socket1;

import com.domain.Message;
import com.util.MessageReadThread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class GuiClient {
    private JFrame f = new JFrame("Client");
    private JPanel p = new JPanel();

    private JTextArea receiveTextArea = new JTextArea(5,30);
    private JTextArea sendTextArea = new JTextArea(5, 30);

    private JButton sendButton = new JButton("Send");

    private Socket socket;

    public GuiClient() {
        try {
            socket = new Socket("127.0.0.1", 9999);

            new MessageReadThread(socket, receiveTextArea).start();

        } catch (IOException e) {
            e.printStackTrace();
        }


        init();
    }  // GuiClient

    public void init(){
        sendButton.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {

                try {
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

                    Message message = new Message();
                    message.setMsg(sendTextArea.getText());

                    oos.writeObject(message);
                    oos.flush();

                    System.out.println("---------");
                    sendTextArea.setText("");


                } catch (IOException e1) {
                    e1.printStackTrace();
                }


            }  // actionPerformed
        });


        p.add(receiveTextArea);
        p.add(sendTextArea);
        p.add(sendButton);

        f.add(p);

        f.setSize(250, 250);
        f.setVisible(true);
    }  // init

    public static void main(String[] args) {
        new GuiClient();
    }
}
