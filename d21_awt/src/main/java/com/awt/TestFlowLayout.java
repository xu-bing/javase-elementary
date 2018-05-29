package com.awt;

import java.awt.*;

public class TestFlowLayout {
	public static void main(String[] args) {
		// 1. ���ڼ�����
		Frame f = new Frame("TestFlowLayout");
		Panel p = new Panel();	// Ĭ�ϵĲ��ֹ�����ΪFlowLayout
		
		// �ı䲼�ֹ�����
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));	// ��ʽ���֣�������Ҷ���
		
		// 2. ���
		Button b = new Button("b");
		Button b1 = new Button("b1");
		Button b2 = new Button("b22");
		Button b3 = new Button("b333");
		Button b4 = new Button("b4444");
			
		// 3. ��װ
		// (a) �������ӵ�panel��
		// ��ʾ��˳�������˳�����
		p.add(b);
		p.add(b2);
		p.add(b1);
		p.add(b3);
		p.add(b4);
		
		// (b) ��panel��ӵ�frame��
		f.add(p);
		
		// 4. ���ô������ԣ�����ʾ
		f.setSize(200,200);
		
		// ���ô�������Ļ�е�λ��
		f.setLocation(200, 200);
		
		f.setVisible(true);
		
	}
}
