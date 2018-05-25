package com.api;

public class StringTest {

    public void testString(){
        // ------------------------------------------
        // 创建字符串
        String s = "Hello World";
        System.out.println(s);

        char[] cs = {'t','o','m'};
        String s1 = new String(cs);
        System.out.println(s1);

        String s2 = new String("jack");
        System.out.println(s2);

        // --------------------------------------------
        // 返回字符串某个位置上的字符
        char c = s.charAt(0);	// 索引位置从0开始
        System.out.println(c);

        // 返回一个字符在字符串中第一次出现的位置
        System.out.println(s.indexOf('h'));	// -1
        System.out.println(s.indexOf('H'));

        // 返回字符串的长度
        System.out.println(s.length());

        // 字符替换
        System.out.println(s.replace('l', '*'));

        // 拼结字符串
        System.out.println(s1.concat(s2));

        // 转换大写
        System.out.println(s.toUpperCase());

        // 分割字符串
        String s4 = "tom,jack,hellen";
        String[] ss = s4.split(",");
        for (String sss : ss){
            System.out.println(sss);
        }

        // 去除字符串前后空白
        String s5 = "	 hello  world	  ";
        System.out.println(s5.length());
        s5 = s5.trim();
        System.out.println(s5.length());


        // -------------------------------------------
        // 把 "helloworld" 反转输出,结果为dlrowolleh
        char[] css = s.toCharArray();
        for (int i = css.length -1; i >=0; i--){
            System.out.print(css[i]);
        }

        // 截取url地址中的内容(login.html): http://www.sohu.com/login.html
        System.out.println();
        String url = "http://www.sohu.com/login.html";
        // 1
        // String sub = url.substring(url.length() - "login.html".length(), url.length());
        // System.out.println(sub);

        // 2.
        int begin = url.lastIndexOf("/") + 1;
        int end = url.length();
        String sub = url.substring(begin, end);
        System.out.println(sub);

        // 138****1988
        // 13815331988
    }

}
