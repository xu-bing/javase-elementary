/**
 * ����
 * ���ñ���ɫ��ǰ��ɫ�ڲ�����ҵʱ��ʾ
 */

package com.awt;

import java.awt.*;


public class TestBorderLayout {
	public static void main(String[] args) {
		// 1. 
		Frame f = new Frame("TestBorderLayout");   // frameĬ�ϵĲ��ֹ�����ΪBorderLayout
		
		Panel p = new Panel();
		// ����p�Ĳ��ֹ�����ΪBorderLayout
		p.setLayout(new BorderLayout());	
		
		Panel northPanel = new Panel();
		// ��������ñ���ɫ
		northPanel.setBackground(new Color(100, 125, 15));
		
		// 2.
		Button b = new Button("b");
		// ����ǰ��ɫ
		b.setForeground(Color.RED);
		
		Button northButton = new Button("northButton");
		Button b1 = new Button("b1");
		Button b2 = new Button("b2");
		Button b3 = new Button("b3");
		Button b4 = new Button("b4");
		
		// 3.
//		p.add(b, BorderLayout.NORTH);
//		p.add(northButton, BorderLayout.NORTH);	// ����ӵ�����Ḳ������ӵ������
		
		// fix:
		northPanel.add(b);
		northPanel.add(northButton);
		
		p.add(northPanel,BorderLayout.NORTH);
		
		p.add(b1, BorderLayout.SOUTH);
		p.add(b2, BorderLayout.WEST);
		p.add(b3, BorderLayout.EAST);
		p.add(b4, BorderLayout.CENTER);
		
		f.add(p);	// Ĭ�Ϸ���λ����CENTER��
		
		// 4.
		f.setSize(200,200);
		f.setLocation(200, 200);
		f.setVisible(true);
		
	}
}
