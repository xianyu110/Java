package com.company.demo3API;

import java.util.function.Function;

/*
java.util.function.Function<T,R> 接口用来根据一个类型的数据得到另一个类型的数据
    前者称为前置条件，后者称为后置条件
Function接口中主要的抽象方法为 R apply(T t),根据类型T的参数获取类型R的结果
    使用的场景例如：将String类型转换为Integer类型
 */
public class Demo01Function {
    public static void change(String s, Function<String,Integer> function) {
        Integer in = function.apply(s);
//        int in = function.apply(s); // 自动拆箱
        System.out.println(in);
    }

    public static void main(String[] args) {
        change("57234",(s)->{
            return Integer.parseInt(s);
        });
    }
}

