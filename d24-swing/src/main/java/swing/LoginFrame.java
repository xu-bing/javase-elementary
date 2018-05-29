package com.swing;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginFrame {
	// 1.
	private JFrame f = new JFrame("登录");
	private JPanel p = new JPanel();
	
	// 2.
	private JLabel userLabel = new JLabel("姓名");
	private JLabel pwdLabel = new JLabel("密码");
	
	private JTextField userTextField = new JTextField(12);
	//private JTextField pwdTextField = new JTextField(12);
	private JPasswordField pwdTextField = new JPasswordField(12);
	
	private JButton loginButton = new JButton("登录");
	
	public LoginFrame(){
		init();
	}
	
	public void init(){
		//
		loginButton.setFont(new Font("宋体",Font.PLAIN, 13));
		
		loginButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 获取前台参数
				String username = userTextField.getText();
				String password = pwdTextField.getText();
				
				// 封装
				User user = new User(username, password);
				
				// 2. 验证
				Login login = new Login(user);
				boolean result = login.login();
				
				//3. 传递结果
				if (result){
					// 打开好友列表界面，并关闭登录界面
					new FriendListFrame();
					f.dispose();	// 关闭登录界面（没有关闭好友列表界面）
				} else {
					System.out.println("姓名或密码错误");
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
		// 设置窗口默认的关闭行为
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		f.setSize(200,200);
		f.setLocation(200,200);
		f.setVisible(true);
		
	}	// init
	
	public static void main(String[] args) {
		new LoginFrame();
	}	// main
	
}
