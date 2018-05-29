package com.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangBackgroundColor {
	// 1.
	Frame f = new Frame("�ı䱳����ɫ");
	Panel p = new Panel();
	
	// 2.
	Button b = new Button("red");
	Button b1 = new Button("blue");
	
	public ChangBackgroundColor(){	
		init();
	}
	
	/**
	 * ��ʼ��
	 * a. �������������
	 * b. ����������¼�������
	 */
	public void init(){		
		//b.addActionListener(new ChangeBackgroundColorListener());
		
		// �ⲿ��ʵ�ּ�����
		// �ص㣺���췽�������Դ���
		//b.addActionListener(new ChangeBackgroundColorListener(p));
//		b.addActionListener(new ChangeBackgroundColorListener(p, 1));
//		b1.addActionListener(new ChangeBackgroundColorListener(p, 2));
		
		// �ڲ���
		// �ô�(������ⲿ��)��ֱ�ӷ����ⲿ��ĳ�Ա�����������ô���
//		b.addActionListener(new InnerChangeBackGroundColorListener());
//		b1.addActionListener(new InnerChangeBackGroundColorListener());
		
		// ������
		b.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				p.setBackground(Color.RED);		
			}			
		});
		
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				p.setBackground(Color.BLUE);			
			}	
		});
		
		// 3.
		// a.
		p.add(b);
		p.add(b1);
		
		// b.
		f.add(p);
		
		// 4.
		f.setSize(200,200);
		f.setLocation(200, 200);
		
		f.setVisible(true);
	}	// init()
	
	/**
	 * �ڲ��ࣺʵ�ּ�����
	 * @author boode
	 *
	 */
	public class InnerChangeBackGroundColorListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("red")){
				p.setBackground(Color.RED);
			} else {
				p.setBackground(Color.BLUE);
			}		
		} 	// actionPerformed
		
	}	// InnerChangeBackGroundColorListener
	

	public static void main(String[] args) {
		ChangBackgroundColor c = new ChangBackgroundColor();	
	}	//main
}
