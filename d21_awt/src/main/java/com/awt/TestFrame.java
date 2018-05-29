package com.awt;

import java.awt.*;

public class TestFrame {
	public static void main(String[] args) {
		// 1. 创建1个程序运行的窗口及容器Panel
		Frame f = new Frame("我的第1个窗口");
		Panel p = new Panel();
		
		// 2. 准备控件
		Button b = new Button("click");
		
		// 3. 组装
		// a. 将控件放置到面板容器中
		p.add(b);
		
		// b. 将容器面板添加到窗口中
		f.add(p);
		
		// 4. 设置窗口的属性，并将其显示
		// 设置大小
		f.setSize(200, 200);
		// 显示窗口
		f.setVisible(true);
	}	
}
