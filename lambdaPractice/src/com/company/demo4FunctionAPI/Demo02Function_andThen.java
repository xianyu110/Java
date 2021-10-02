package com.company.demo4FunctionAPI;

import java.util.function.Function;

/*
Function接口中的默认方法andThen，用来进行组合操作

需求：
    把String类型的“123”转换为Integer类型，把转换后的结果加10
    把转换后的Integer类型的数据转换为String类型
 */
public class Demo02Function_andThen {
    public static void change(String str, Function<String,Integer> fun1, Function<Integer,String> fun2){
        String s = fun1.andThen(fun2).apply(str);
        System.out.println(s);
    }

    public static void main(String[] args) {
        change("1234",(s)->{
            return Integer.parseInt(s) + 10;
        },(in)->{
            return in + ""; // 将Integer类型的数据转换为String类型
        });
    }
}

