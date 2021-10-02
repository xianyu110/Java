package com.company.demo3API;

import java.util.function.Consumer;

/*
练习：
    字符串数组中存有多条信息，请按照格式“姓名：xx。性别：xx。"的格式将信息打印出来
    要求将打印姓名的动作作为第一个Consumer接口的Lambda实例
    要求将打印性别的动作作为第二个Consumer接口的Lambda实例
    将两个Consumer接口按照顺序拼接到一起
 */
public class Demo03Test {
    public static void printMessage(String[] arr, Consumer<String> con1, Consumer<String> con2){
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        // 定义一个字符串类型的数组
        String[] arr = {"法外,20","狂徒,39","张三,40"};
        printMessage(arr,(s)->{
            String[] strings = s.split(",");
            System.out.print("姓名：" + strings[0] + "。");
        },(s)->{
            String[] strings = s.split(",");
            System.out.println("性别：" + strings[1] + "。");
        });
    }
}

