package com.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    @Test
    public void testList(){
        List list = new ArrayList(15);

        list.add(1);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(6);


        list.remove((Integer)7);
//        list.remove(3);

        System.out.println(list.size());

        System.out.println("11111111111");


        System.out.println("&&&&&&&&&&&&&&&");

        System.out.println("!!!!!!!!!!!!!!!");

        System.out.println("###############");

        System.out.println("22222222222");

        System.out.println("--------------");
    }
}
