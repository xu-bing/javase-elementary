package com.api;

public class TestWrapperType {
	
	public static void main(String[] args) {
		// -----------------------------------
		// create
		Integer i = new Integer(1);
		Integer j = new Integer("123");		// ��ʾ String ������ָʾ�� int ֵ
		
		Double d = new Double(3.14);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(d);
		
		// fields
		System.out.println(Integer.MAX_VALUE);
		
		// methods
		// �ַ���ת��ֵ
		String str = "123";
		Integer m = Integer.parseInt(str);
		
		// --------------------------------
		// int��Integer֮��ת��
		// 1. jdk5.0֮ǰ
		Integer x = new Integer(1);
		int y = x.intValue();			// ��Integer��ֵ����int
		Integer n = Integer.valueOf(y);	// ��int��װ��Integer
		
		// 2. jdk5.0+ ���Զ�ת����
		int a = 1;
		Integer b = a;		// �Զ�װ��
		int c = b;			// �Զ����� 
		
		// --------------------------------
		Integer k = new Integer(1);
		Integer o = new Integer(1);
		System.out.println(k == o);		// false
		
	}	// main
	
}	// TestWrapperType
