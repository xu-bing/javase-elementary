package com.api;

import java.util.Date;

public class CompareString {
	
	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println(s1 == "abc");	// true
		
		String s2 = new String("abc");
		System.out.println(s2 == "abc");	// false
		
		String s3 = new String("abc");
		System.out.println(s3 == s2); 		// false
		
		String s4 = "a" + "b";
		System.out.println(s4 == "ab");  	// true
		
		final String s = "a";
		String s5 = s + "b";
		System.out.println(s5 == "ab");  	// true
		
		String s7 = "a";
		String s8 = "b";
		String s6 = s7 + s8;
		System.out.println(s6 == "ab");  	// false
		
		System.out.println(s6.equals("ab"));	// true
		
		Person p1 = new Person("tom", 20);
		Person p2 = new Person("tom", 20);
		System.out.println(p1 == p2);  // false
		
		System.out.println(p1.equals(p2));	
		
		Date d = new Date();
		System.out.println(p1.equals(d));
		
	}	// main
	
}	// CompareString
