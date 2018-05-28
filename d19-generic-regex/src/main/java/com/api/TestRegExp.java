package com.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegExp {
    public static void main(String[] args) {
        // 美国社保号 421-58-2274
        String regex = "[0-9]{3}-[0-9]{2}-[0-9]{4}";

        // 1. 创建1个模式对象
        Pattern p = Pattern.compile(regex);

        // 2. 创建匹配对象
        Matcher m = p.matcher("421-58-2274");

        // 3. 匹配，返回结果
        boolean b = m.matches();
        System.out.println(b);

        // 手机号码正则表达式:1,3或5或7或8,余下9位任意
        regex = "1[3578][0-9]{9}";
        p = Pattern.compile(regex);
        m = p.matcher("19861931788");
        System.out.println(m.matches());


        // 邮箱的正则表达式：6-18位字母或数字组成 @ 2-12位字母或数字组成 . 2到4位字母组成域名类型
        // boode@boode.com
        regex = "\\w{6,18}@\\w{2,12}\\.[a-z]{2,4}";
        p = Pattern.compile(regex);
        m = p.matcher("booode@boodedcom");
        System.out.println(m.matches());

    }	// main
}
