package com.company.demo3API;

import java.util.function.Predicate;

/*
需求：判断字符串的长度是否大于5
    1.大于，返回false
    2.小于，返回true

 */
public class Demo04Predicate_negate {
    // 定义一个方法，方法的参数传递一个字符串，传递两个Predicate接口
    public static boolean checkString(String s, Predicate<String> p) {
        return p.negate().test(s);
    }

    public static void main(String[] args) {
        boolean b = checkString("hnoidf", (s) -> {
            return s.length() > 5;
        });
        System.out.println(b);
    }

}

