package com.event;

import java.awt.*;

public class TestActionListener {
	
	public static void main(String[] args) {
		// 1. ���ڼ�����
		Frame f = new Frame();
		Panel p = new Panel();
		
		// 2. ���
		Button b = new Button("�ر�");
	
		// ��������
		b.setForeground(Color.BLUE);
		
		// ����ť������굥���¼��Ĵ�����
		// ������Ӧ���¼�������Ӧ���¼�������
		// ��. ע���¼�������
		b.addActionListener(new MyActionListener());
			
		// 3. ��װ
		// a. ��������뵽���������
		p.add(b);
		
		// b. �������뵽������
		f.add(p);
				
		// 4. ���ô������ԣ�����ʾ����
		f.setSize(200,200);
		f.setLocation(200,200);
		
		f.setVisible(true);
		
	}	// main
	
}
