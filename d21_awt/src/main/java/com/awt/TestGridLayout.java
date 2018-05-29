package com.awt;

import java.awt.*; 

public class TestGridLayout {
	public static void main(String[] args) {
		// 1.
		Frame f = new Frame("TestGridLayout");
		Panel p = new Panel();
		
		// ����p�Ĳ��ֹ�����ΪGridLayout
		p.setLayout(new GridLayout(3,2,10,20));
		
		// 2.
		Button b = new Button("b");
		Button b1 = new Button("b1");
		Button b2 = new Button("b2");
		Button b3 = new Button("b3");
		Button b4 = new Button("b4");
		Button b5 = new Button("b5");
		//Button b6 = new Button("b5");
		
		// 3.
		// 使用gridlayout时，组件添加自动按从左到右，从上往下的顺序进行
		p.add(b);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		//p.add(b6);
		
		f.add(p);
		
		// 4.
		f.setSize(200,200);
		f.setLocation(200,200);
		f.setVisible(true);
		
	}	// main
}
