package com.swing;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginFrame {
	// 1.
	private JFrame f = new JFrame("��¼");
	private JPanel p = new JPanel();
	
	// 2.
	private JLabel userLabel = new JLabel("����");
	private JLabel pwdLabel = new JLabel("����");
	
	private JTextField userTextField = new JTextField(12);
	//private JTextField pwdTextField = new JTextField(12);
	private JPasswordField pwdTextField = new JPasswordField(12);
	
	private JButton loginButton = new JButton("��¼");
	
	public LoginFrame(){
		init();
	}
	
	public void init(){
		//
		loginButton.setFont(new Font("����",Font.PLAIN, 13));
		
		loginButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. ��ȡǰ̨����
				String username = userTextField.getText();
				String password = pwdTextField.getText();
				
				// ��װ
				User user = new User(username, password);
				
				// 2. ��֤
				Login login = new Login(user);
				boolean result = login.login();
				
				//3. ���ݽ��
				if (result){
					// �򿪺����б���棬���رյ�¼����
					new FriendListFrame();
					f.dispose();	// �رյ�¼���棨û�йرպ����б���棩
				} else {
					System.out.println("�������������");
				}
				
			}	//actionPerformed
			
		});
		
		// 3.
		p.add(userLabel);
		p.add(userTextField);
		p.add(pwdLabel);
		p.add(pwdTextField);
		p.add(loginButton);
		
		f.add(p);
		
		// 4.
		// ���ô���Ĭ�ϵĹر���Ϊ
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		f.setSize(200,200);
		f.setLocation(200,200);
		f.setVisible(true);
		
	}	// init
	
	public static void main(String[] args) {
		new LoginFrame();
	}	// main
	
}
