package com.domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonTest {
    private Person p;


    @Before
    public void setUp(){
        p = new Person("jack", 55);
    }

    @After
    public void tearDown(){
        System.out.println("Person::[username]:" + p.getUsername() + " [age]:" + p.getAge());
    }

    @Test
    public void test(){
        List list = null;

        Person p = new Person();
        p.setUsername("tom");
        p.setAge(20);

        list = new ArrayList(3);
        list.add(null);
        list.add(p);
        list.add(new Person("jack", 21));
        list.add(new Date());

        int i = Integer.parseInt("5");

        System.out.println(list);

       /* Person pp = (Person) list.get(0);
        System.out.println(pp.getUsername());*/



//        System.out.println(((Person)list.get(0)).getUsername());

        System.out.println("------------");

    }   // test

    @Test
    public void testSettersGetters(){
        // given
        p = new Person("jerry", 90);
        // when

        // then

    }

}
