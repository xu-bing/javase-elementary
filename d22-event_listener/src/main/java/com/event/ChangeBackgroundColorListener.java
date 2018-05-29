package com.event;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeBackgroundColorListener implements ActionListener{
	// 定义1个成员变量，用来保存另外一个类传来的参数的值
	private Panel p;
	private int flag;
	
	public ChangeBackgroundColorListener() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChangeBackgroundColorListener(Panel p){
		this.p = p;
	}
	
	public ChangeBackgroundColorListener(Panel p, int flag){
		this.p = p;
		this.flag = flag;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		/*ChangBackgroundColor c = new ChangBackgroundColor();
		c.p.setBackground(Color.RED);*/
		
		//p.setBackground(Color.RED);
		
		//------------------------------
		// 通过标识位来区别不同的事件源
		/*
		 * if (red){
		 * 	p.set...
		 * } else if (blue){
		 *  p.set...
		 * }
		 */
		
		/*if (flag == 1){
			p.setBackground(Color.RED);
		} else {
			p.setBackground(Color.BLUE);
		}*/
		
		// ----------------------------
		System.out.println(e);
		
		if (e.getActionCommand().equals("red")){
			p.setBackground(Color.RED);
		} else {
			p.setBackground(Color.BLUE);
		}
		
	}

}
