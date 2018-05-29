package com.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangBackgroundColor {
	// 1.
	Frame f = new Frame("改变背景颜色");
	Panel p = new Panel();
	
	// 2.
	Button b = new Button("red");
	Button b1 = new Button("blue");
	
	public ChangBackgroundColor(){	
		init();
	}
	
	/**
	 * 初始化
	 * a. 给组件设置属性
	 * b. 给组件增加事件处理方法
	 */
	public void init(){		
		//b.addActionListener(new ChangeBackgroundColorListener());
		
		// 外部类实现监听器
		// 特点：构造方法，属性传参
		//b.addActionListener(new ChangeBackgroundColorListener(p));
//		b.addActionListener(new ChangeBackgroundColorListener(p, 1));
//		b1.addActionListener(new ChangeBackgroundColorListener(p, 2));
		
		// 内部类
		// 好处(相对于外部类)：直接访问外部类的成员变量，而不用传参
//		b.addActionListener(new InnerChangeBackGroundColorListener());
//		b1.addActionListener(new InnerChangeBackGroundColorListener());
		
		// 匿名类
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
	 * 内部类：实现监听器
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
