package com.homework;

import org.junit.Test;

public class StringUtilTest {

    @org.junit.Test
    public void arr2String() {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        StringUtil stringTest = new StringUtil();
        stringTest.arr2String();
    }


    @Test
    public void arr2String2() {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        System.out.println(new StringUtil().arr2String2(arr));
    }


    @Test
    public void arr2String3() {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        System.out.println(new StringUtil().arr2String3(arr));
    }
}