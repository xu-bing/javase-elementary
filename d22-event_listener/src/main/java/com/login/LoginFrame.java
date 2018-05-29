package com.login;

import java.awt.*;

public class LoginFrame {
	// 1. 窗口及容器
	private Frame f = new Frame();
	private Panel p = new Panel();
	
	// 2. 组件
	private Label userLabel = new Label("username");
	private Label passwordLabel = new Label("password");
	
	private TextField userTextField = new TextField(10);
	private TextField passwordTextField = new TextField(10);
	
	private Button loginButton = new Button("登录");
	
	private Label msgLabel = new Label("         ");
	
	public LoginFrame() {
		init();
	}

	public void init(){
		// 2.1：设置属性/增加事件处理方法
		// 给文本框设置回显字符
		passwordTextField.setEchoChar('*');
		
		/*passwordTextField.getText();
		passwordTextField.setText("");*/
		
		// TODO: 给loginButton增加事件处理
		
		
		// 3. 组装
		// a. 将组件加入到panel容器中
		p.add(userLabel);
		p.add(userTextField);
		p.add(passwordLabel);
		p.add(passwordTextField);
		
		p.add(loginButton);
		
		// b. 将容器加入到窗口中
		f.add(p);
		
		// 4. 设置窗口属性，并显示窗口
		f.setSize(200,200);
		f.setLocation(200, 200);
		
		f.setVisible(true);
		
	}	// init
	
	public static void main(String[] args) {
		LoginFrame loginFrame = new LoginFrame();
	}	// main
	
}
