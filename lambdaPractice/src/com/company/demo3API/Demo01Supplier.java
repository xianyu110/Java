package com.company.demo3API;

import java.util.function.Supplier;

/*
常用的函数式接口
java.util.function.Supplier<T> 接口仅包含一个无参的方法：T get()，用来获取一个泛型参数指定类型的对象数据

Supplier<T> 接口被称之为生产型接口，指定接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据
 */
public class Demo01Supplier {
    // 定义一个方法，方法的参数传递Supplier<T>接口，泛型指定String,get方法就会返回String
    public static String getString(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
//        String s = getString(() -> {
//            // 生产一个字符串并返回
//            return "胡歌";
//        });

        // 优化
        String s = getString(() -> "胡歌");
        System.out.println(s);
    }
}

