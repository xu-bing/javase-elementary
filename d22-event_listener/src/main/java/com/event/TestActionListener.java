package com.event;

import java.awt.*;

public class TestActionListener {
	
	public static void main(String[] args) {
		// 1. 窗口及容器
		Frame f = new Frame();
		Panel p = new Panel();
		
		// 2. 组件
		Button b = new Button("关闭");
	
		// 设置属性
		b.setForeground(Color.BLUE);
		
		// 给按钮增加鼠标单击事件的处理方法
		// 根据相应的事件增加相应的事件监听器
		// 三. 注册事件监听器
		b.addActionListener(new MyActionListener());
			
		// 3. 组装
		// a. 将组件加入到容器面板中
		p.add(b);
		
		// b. 将面板加入到窗口中
		f.add(p);
				
		// 4. 设置窗口属性，并显示窗口
		f.setSize(200,200);
		f.setLocation(200,200);
		
		f.setVisible(true);
		
	}	// main
	
}
