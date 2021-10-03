package com.company.demo3API;

import java.util.function.Predicate;

/*
java.util.function.Predicate<T> 接口
作用：对某种数据类型的数据进行判断，结果返回一个boolean值

Predicate接口中包含一个抽象方法
    boolean test(T t) 用来对指定数据类型数据进行判断的方法
        结果：
            符合条件 true
            不合符条件 false
 */
public class Demo01Predicate {
    // 定义一个方法，参数传递一个String类型的字符串，传递一个Predicate接口，泛型使用String,使用方法test对字符串进行判断，并把判断的结果进行返回
    public static boolean judge(String s, Predicate<String> p) {
        return p.test(s);
    }

    public static void main(String[] args) {
        boolean b = judge("cnxo", (s) -> s.length() == 3);
        System.out.println(b);
    }
}

