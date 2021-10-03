package com.company.demo4FunctionAPI;

import java.util.function.Function;

/*
练习：自定义函数模型拼接
请使用Function进行函数模型的拼接，按照顺序需要执行多个函数操作为：
    String str = "张三，30";
    1.将字符串截取数字年龄部分，得到字符串
    2.将上一步的字符串转换为int类型的数据
    3.将上一步int数字累加100，得到结果int数字
 */
public class Demo03Test {
    public static void change(String str, Function<String,String> fun1, Function<String,Integer> fun2, Function<Integer,Integer> fun3 ){
        int num = fun1.andThen(fun2.andThen(fun3)).apply(str);
        System.out.println(num);
    }

    public static void main(String[] args) {
        change("张三，30",(str)->{
            return str.split("，")[1];
        },(str)->{
            return Integer.parseInt(str);
        },(in)->{
            return in + 100;
        });
    }
}

