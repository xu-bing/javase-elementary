package com.event;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeBackgroundColorListener implements ActionListener{
	// ����1����Ա������������������һ���ഫ���Ĳ�����ֵ
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
		// ͨ����ʶλ������ͬ���¼�Դ
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
