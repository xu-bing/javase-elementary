package com.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

    @Test
    public void test(){

//        排序
//        洗牌
//        最大值，最小值

//        拷贝
        List<String> src = new ArrayList<String>();
        src.add("1111");
        src.add("2222");
        src.add("3333");

        List<String> dest = new ArrayList<String>();
        /*dest.add(null);
        dest.add(null);
        dest.add(null);*/

        Collections.addAll(dest, new String[src.size()]);

        Collections.copy(dest, src);
        System.out.println(dest);

    }
}
