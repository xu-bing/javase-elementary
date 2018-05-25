package com.api;

public class TestWrapperType {
	
	public static void main(String[] args) {
		// -----------------------------------
		// create
		Integer i = new Integer(1);
		Integer j = new Integer("123");		// 表示 String 参数所指示的 int 值
		
		Double d = new Double(3.14);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(d);
		
		// fields
		System.out.println(Integer.MAX_VALUE);
		
		// methods
		// 字符串转数值
		String str = "123";
		Integer m = Integer.parseInt(str);
		
		// --------------------------------
		// int和Integer之间转换
		// 1. jdk5.0之前
		Integer x = new Integer(1);
		int y = x.intValue();			// 将Integer的值赋给int
		Integer n = Integer.valueOf(y);	// 将int包装成Integer
		
		// 2. jdk5.0+ （自动转换）
		int a = 1;
		Integer b = a;		// 自动装箱
		int c = b;			// 自动拆箱 
		
		// --------------------------------
		Integer k = new Integer(1);
		Integer o = new Integer(1);
		System.out.println(k == o);		// false
		
	}	// main
	
}	// TestWrapperType
