package com.login;

import java.awt.*;

public class LoginFrame {
	// 1. ���ڼ�����
	private Frame f = new Frame();
	private Panel p = new Panel();
	
	// 2. ���
	private Label userLabel = new Label("username");
	private Label passwordLabel = new Label("password");
	
	private TextField userTextField = new TextField(10);
	private TextField passwordTextField = new TextField(10);
	
	private Button loginButton = new Button("��¼");
	
	private Label msgLabel = new Label("         ");
	
	public LoginFrame() {
		init();
	}

	public void init(){
		// 2.1����������/�����¼�������
		// ���ı������û����ַ�
		passwordTextField.setEchoChar('*');
		
		/*passwordTextField.getText();
		passwordTextField.setText("");*/
		
		// TODO: ��loginButton�����¼�����
		
		
		// 3. ��װ
		// a. ��������뵽panel������
		p.add(userLabel);
		p.add(userTextField);
		p.add(passwordLabel);
		p.add(passwordTextField);
		
		p.add(loginButton);
		
		// b. ���������뵽������
		f.add(p);
		
		// 4. ���ô������ԣ�����ʾ����
		f.setSize(200,200);
		f.setLocation(200, 200);
		
		f.setVisible(true);
		
	}	// init
	
	public static void main(String[] args) {
		LoginFrame loginFrame = new LoginFrame();
	}	// main
	
}
