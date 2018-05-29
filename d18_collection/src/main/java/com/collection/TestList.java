/**
 * 知识点：
 *
 *
 */
package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class TestList {
    public static void main(String[] args) {
        // 1. 创建ArrayList对象
        List list = new ArrayList();

        // 2. 添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1);

        // 3. 取元素
        // 3.1 取单个元素(根据索引来取)
        System.out.println(list.get(2));

        // 3.2 遍历元素
        // (1)普通for循环
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("---------");
        // (2)for循环新特性
        for (Object o : list){
            Integer i = (Integer)o;
            System.out.println(i);
        }

        System.out.println("---------");
        // (3)使用迭代器进行遍历
        Iterator ite = list.iterator();

        while(ite.hasNext()){
            Object e = ite.next();
            System.out.println((Integer)e);
        }

        // 4. 删除元素
        list.remove(4);

        System.out.println(list.size());
    }	// main


}
