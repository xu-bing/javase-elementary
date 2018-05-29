package com.awt;

import java.awt.*;

public class TestFlowLayout {
	public static void main(String[] args) {
		// 1. 窗口及容器
		Frame f = new Frame("TestFlowLayout");
		Panel p = new Panel();	// 默认的布局管理器为FlowLayout
		
		// 改变布局管理器
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));	// 流式布局，组件居右对齐
		
		// 2. 组件
		Button b = new Button("b");
		Button b1 = new Button("b1");
		Button b2 = new Button("b22");
		Button b3 = new Button("b333");
		Button b4 = new Button("b4444");
			
		// 3. 组装
		// (a) 将组件添加到panel中
		// 显示的顺序由添加顺序决定
		p.add(b);
		p.add(b2);
		p.add(b1);
		p.add(b3);
		p.add(b4);
		
		// (b) 将panel添加到frame中
		f.add(p);
		
		// 4. 设置窗口属性，并显示
		f.setSize(200,200);
		
		// 设置窗口在屏幕中的位置
		f.setLocation(200, 200);
		
		f.setVisible(true);
		
	}
}
