package com.api;

import org.junit.Test;

/**
 * 字符串常量池
 */
public class StringCompareTest {

    @Test
    public void testStringCompare(){
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);    // 比较字符串的值(字符串变量的地址)
        System.out.println(s1.equals(s2));  // 比较字符串的内容

        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        // 字符串是不可变的序列
        String s5 = "efg";
        s5 = "123";


    }

}
