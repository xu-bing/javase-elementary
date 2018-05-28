package com.api;

import java.util.*;

public class TestGenericType {
    public static void main(String[] args) {
        // 不使用泛型
        List list = new ArrayList();

        list.add(1);
        list.add(3);
        //	list.add("tom");
        list.add(4);

        for (Object o : list){
            Integer i = (Integer)o;
            System.out.println(i);
        }	// for

        // -------------
        // 泛型（参数化类型）
        List<Integer> list2 = new ArrayList<Integer>();

        list2.add(1);
        list2.add(2);
        //	list2.add("tom");	// error

        int sum = 0;

        for (Integer i : list2){
            sum += i;
        }

        System.out.println(sum);

        // Set
        Set<Person> personSet = new HashSet<Person>();
        personSet.add(new Person("张三",20));
        personSet.add(new Person("李四",21));

        // Map
        Map<Integer, String> map = new HashMap<Integer, String>();


    }	// main

}
