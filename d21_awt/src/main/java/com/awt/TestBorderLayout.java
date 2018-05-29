/**
 * 任务：
 * 设置背景色、前景色在布置作业时演示
 */

package com.awt;

import java.awt.*;


public class TestBorderLayout {
	public static void main(String[] args) {
		// 1. 
		Frame f = new Frame("TestBorderLayout");   // frame默认的布局管理器为BorderLayout
		
		Panel p = new Panel();
		// 更改p的布局管理器为BorderLayout
		p.setLayout(new BorderLayout());	
		
		Panel northPanel = new Panel();
		// 给面板设置背景色
		northPanel.setBackground(new Color(100, 125, 15));
		
		// 2.
		Button b = new Button("b");
		// 设置前景色
		b.setForeground(Color.RED);
		
		Button northButton = new Button("northButton");
		Button b1 = new Button("b1");
		Button b2 = new Button("b2");
		Button b3 = new Button("b3");
		Button b4 = new Button("b4");
		
		// 3.
//		p.add(b, BorderLayout.NORTH);
//		p.add(northButton, BorderLayout.NORTH);	// 后添加的组件会覆盖先添加的组件。
		
		// fix:
		northPanel.add(b);
		northPanel.add(northButton);
		
		p.add(northPanel,BorderLayout.NORTH);
		
		p.add(b1, BorderLayout.SOUTH);
		p.add(b2, BorderLayout.WEST);
		p.add(b3, BorderLayout.EAST);
		p.add(b4, BorderLayout.CENTER);
		
		f.add(p);	// 默认放置位置在CENTER中
		
		// 4.
		f.setSize(200,200);
		f.setLocation(200, 200);
		f.setVisible(true);
		
	}
}
