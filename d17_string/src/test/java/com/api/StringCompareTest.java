package com.api;

import org.junit.Test;

public class StringCompareTest {

    @Test
    public void testStringCompare(){
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

    }

}
