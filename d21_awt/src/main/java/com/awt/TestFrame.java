package com.awt;

import java.awt.*;

public class TestFrame {
	public static void main(String[] args) {
		// 1. ����1���������еĴ��ڼ�����Panel
		Frame f = new Frame("�ҵĵ�1������");
		Panel p = new Panel();
		
		// 2. ׼���ؼ�
		Button b = new Button("click");
		
		// 3. ��װ
		// a. ���ؼ����õ����������
		p.add(b);
		
		// b. �����������ӵ�������
		f.add(p);
		
		// 4. ���ô��ڵ����ԣ���������ʾ
		// ���ô�С
		f.setSize(200, 200);
		// ��ʾ����
		f.setVisible(true);
	}	
}
