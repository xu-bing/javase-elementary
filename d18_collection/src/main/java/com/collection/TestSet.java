package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		// 1. 创建Set
		Set set = new HashSet();
		
		// 2. 添加元素
		set.add(6);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(5);
		
		// 3. 取元素
		// 遍历元素
		
		/*
		  // error
		  for (int i = 0; i < set.size(); i++){
			//System.out.println();
		}*/
		
		// 3.1 for 循环新特性
		for (Object o : set){
			System.out.println(o);
		}
		
		// 3.2 iterator
		Iterator ite = set.iterator();
		
		while(ite.hasNext()){
			Integer i = (Integer)ite.next();
			System.out.println(i);
		}

		//已知一组整数，如：3,6,8,3,6,7,2,9,4,3，请编程去掉其中重复的数字
		int[] arr1= {3,6,8,3,6,7,2,9,4,3};
		String[] ss = {"张三","李四","张三"};
		Set set1 = new HashSet();
		for (int i : arr1) {
			set1.add(i);//set会自动去重
		}
		for(String s: ss){
			set1.add(s);
		}
		System.out.println(set1);


		//去除重复的Person
		/*
		 *判断两个对象是否相等的标准：
		 * (1)equals中的具体判断逻辑得成立
		 * (2)两个对象的hashCode得相等
		 */
		Person p1 = new Person("张三",20);
		Person p2 = new Person("张三",20);
		Person p3 = new Person("李四",21);

		Set persons = new HashSet();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		System.out.println(persons);

		
	}	// main
	
}
