package com.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * 写1个代码片断来统计候选人的得票数
 * 假设有10张选票，3个候选人，每张选票只能选1个人（3选1），结果形式如下：
 * 张三：3， 李四：3， 王五：4
 */
public class TestVote {

    public static void main(String[] args) {
        // 1. 选择1个容器，用来存储10张选票（数组）
        Vote[] votes = new Vote[10];

        votes[0] = new Vote("张三");
        votes[1] = new Vote("李四");


        // 2. 使用map来统计票数
        Map<Vote, Integer>  map = new HashMap<Vote, Integer>();

        for (Vote v : votes){

            if (!map.containsKey(v)){
                map.put(v, 1);

            } else {
                Integer ticket = map.get(v);
                map.put(v, ticket + 1);
            }
        }  // for


        // 3. 打印统计结果(使用迭代器)

    }
}
