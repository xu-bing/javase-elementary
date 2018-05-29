package com.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 一. 定义1个类，实现ActionListener接口
 * @author boode
 *
 */
public class MyActionListener implements ActionListener {

	// 二. 具体的事件处理代码
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("-----");
		
		// 关闭虚拟机
		System.exit(-1);
	}
}
