package com.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(6);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(7);

        // 调用Collections的max方法取集合中的最大值
        Integer max = (Integer) Collections.max(list);
        System.out.println(max);

        //调用Collections的静态方法sort()对list中的整数进行排序
        Collections.sort(list);
        System.out.println(list);


        // 集合拷贝
        List<String> src = new ArrayList<String>();
        src.add("111");
        src.add("222");
        src.add("333");
        src.add("444");
        List<String> dest1  =   new  ArrayList<String>();
        Collections.addAll(dest1,  new  String[src.size()]);
        Collections.copy(dest1, src);
        for (Object s : dest1) {
            System.out.println(s);
        }


        List personList = new ArrayList();
        personList.add(new Person("张三",20));
        personList.add(new Person("李四",19));
        personList.add(new Person("王五",30));
        personList.add(new Person("马六",23));

        //对人的数组进行排序
        Collections.sort(personList);

        for(Object o : personList){
            Person p = (Person)o;
            System.out.println(p.getAge());
        }

    }    // main
}
