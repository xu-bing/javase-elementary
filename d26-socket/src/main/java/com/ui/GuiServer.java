package com.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GuiServer {
    private JFrame f = new JFrame("server");
    private JPanel p = new JPanel();

    private JTextArea receiveTextArea = new JTextArea(5,30);
    private JTextArea sendTextArea = new JTextArea(5, 30);

    private JButton sendButton = new JButton("Send");

    public GuiServer() {
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

    public static void main(String[] args) {
        new GuiServer();
    }
}
