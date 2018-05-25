package com.domain;

import java.util.Set; //调用java.util.Set
        import java.util.HashSet;//调用java.util.HashSet
        import java.util.Iterator;//调用java.util.Iterator

        public class Voter {   //定义类
            private static final int MAX_COUNT = 100;  //静态变量，最大投票数，到达此数就停止投票
            private static int count;      //静态变量，投票数
            private static Set<Voter> voters = new HashSet<Voter>(); //静态变量，存放所有已经投票的选民
            private String name;  //实例变量，投票人姓名

            public Voter(String name) {
                this.name = name;
            } //定义名字字符串函数

            /**
             * 投票
             * 每次投票，则投票数加1
             */
            public void voteFor() {  //投票函数
                if (count == MAX_COUNT){        //如果计数结果等于投票人数最大值
                    System.out.println("投票活动已经结束"); //打印投票活动已经结束
                    return; //返回主函数
                }
                if (voters.contains(this))  //如果已包含投票人姓名
                    System.out.println(name + ":你不允许重复投票！"); //打印投票人姓名和你不允许重复投票！
                else {    //否则
                    count++;  //计数加一
                    voters.add(this);  //调用字符串函数添加投票人姓名
                    System.out.println(name + ":感谢你投票！"); //打印投票人姓名和感谢你投票！
                }
            }

            /**
             * 打印投票结果
             */
            public static void printVoteResult() { //投票结果函数
                System.out.println("当前投票数为:" + count); //打印当前投票数为，并且统计人数
                System.out.println("参与投票的选民名单如下"); //打印参与投票的选民名单如下
                for (Voter voter : voters) {     //遍历voters集合
                    System.out.println(voter.name); //打印输出投票名称
                }
            }

            public static void main(String args[]) {  //主函数
                Voter tom = new Voter("Tom");  //开辟空间定义元素tom
                Voter mike = new Voter("Mike");//开辟空间定义元素mike
                Voter jack = new Voter("Jack");//开辟空间定义元素jack

                tom.voteFor();
                tom.voteFor();
                mike.voteFor();
                jack.voteFor();

                Voter.printVoteResult();
            }
        }