package com.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * һ. ����1���࣬ʵ��ActionListener�ӿ�
 * @author boode
 *
 */
public class MyActionListener implements ActionListener {

	// ��. ������¼��������
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("-----");
		
		// �ر������
		System.exit(-1);
	}
}
