package com.swing;

import javax.swing.*;

public class FriendListFrame {
	// 1. 
	private JFrame f = new JFrame("∫√”—¡–±Ì");
	private JPanel p = new JPanel();
	
	// 2.
	private JList friendList = new JList();
	private JLabel imgLabel = new JLabel(new ImageIcon("c:\\cross.jpg"));
	
	
	public FriendListFrame(){
		init();
	}
	
	public void init(){
		DefaultListModel dlm = new DefaultListModel();
		dlm.addElement("tom");
		dlm.addElement("jerry");
		dlm.addElement("jack");
		dlm.addElement("john");
		
		friendList.setModel(dlm);
		
		// 3.
		p.add(friendList);
		p.add(imgLabel);
		
		f.add(p);
		
		// 4.
		f.setSize(200, 400);
		f.setVisible(true);
		
	}	// init

	public static void main(String[] args) {
		new FriendListFrame();
	}
}