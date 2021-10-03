package com.company.demo3API;

import java.util.function.Predicate;

/*
需求：判断一个字符串，有两个判断条件
    1.判断字符串的长度是否大于5
    2.判断字符串中是否含有a
满足一个条件即可，可以使用||运算符连接两个条件

 */
public class Demo03Predicate_or {
    // 定义一个方法，方法的参数传递一个字符串，传递两个Predicate接口
    public static boolean checkString(String s, Predicate<String> p1, Predicate<String> p2) {
        return p1.or(p2).test(s);
    }

    public static void main(String[] args) {
        boolean b = checkString("hnoidf", (s) -> {
            return s.length() > 5;
        }, (s) -> {
            return s.contains("a");
        });
        System.out.println(b);
    }
}

