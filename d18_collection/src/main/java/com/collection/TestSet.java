package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		// 1. ����Set
		Set set = new HashSet();
		
		// 2. ���Ԫ��
		set.add(6);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(5);
		
		// 3. ȡԪ��
		// ����Ԫ��
		
		/*
		  // error
		  for (int i = 0; i < set.size(); i++){
			//System.out.println();
		}*/
		
		// 3.1 for ѭ��������
		for (Object o : set){
			System.out.println(o);
		}
		
		// 3.2 iterator
		Iterator ite = set.iterator();
		
		while(ite.hasNext()){
			Integer i = (Integer)ite.next();
			System.out.println(i);
		}

		//��֪һ���������磺3,6,8,3,6,7,2,9,4,3������ȥ�������ظ�������
		int[] arr1= {3,6,8,3,6,7,2,9,4,3};
		String[] ss = {"����","����","����"};
		Set set1 = new HashSet();
		for (int i : arr1) {
			set1.add(i);//set���Զ�ȥ��
		}
		for(String s: ss){
			set1.add(s);
		}
		System.out.println(set1);


		//ȥ���ظ���Person
		/*
		 *�ж����������Ƿ���ȵı�׼��
		 * (1)equals�еľ����ж��߼��ó���
		 * (2)���������hashCode�����
		 */
		Person p1 = new Person("����",20);
		Person p2 = new Person("����",20);
		Person p3 = new Person("����",21);

		Set persons = new HashSet();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		System.out.println(persons);

		
	}	// main
	
}
