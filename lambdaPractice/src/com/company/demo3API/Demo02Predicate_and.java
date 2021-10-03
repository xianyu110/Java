package com.company.demo3API;

import java.util.function.Predicate;

/*
逻辑表达式：可以链接多个判断的条件
&&：与运算符，有false则false
||：或运算符，有true则true
!:非（取反）运算符，非真即假，非假即真

需求：判断一个字符串，有两个判断条件
    1.判断字符串的长度是否大于5
    2.判断字符串中是否含有a
两个条件必须同时满足，可以使用&&运算符连接两个条件

Predicate接口中有一个方法and，表示并且关系，也可以链接两个判断条件
 */
public class Demo02Predicate_and {
    // 定义一个方法，方法的参数传递一个字符串，传递两个Predicate接口
    public static boolean checkString(String s, Predicate<String> p1, Predicate<String> p2) {
//        return p1.test(s) && p2.test(s);
        return p1.and(p2).test(s);
    }

    public static void main(String[] args) {
        boolean b = checkString("noidf", (s) -> {
            return s.length() > 5;
        }, (s) -> {
            return s.contains("a");
        });
        System.out.println(b);
    }
}

