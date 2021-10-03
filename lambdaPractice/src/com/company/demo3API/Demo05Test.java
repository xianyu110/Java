package com.company.demo3API;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
练习：集合信息的筛选
数组中有多条“姓名+性别”的信息如下：
String[] arr = {"迪士尼发泡，男", "都不能，女", "建筑室内哈佛请问，女", "找刺激，男"};
请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中
需要同时满足两个条件：
    1.必须为女生
    2.姓名为4个字
 */
public class Demo05Test {
    public static ArrayList<String> filter(String[] arr, Predicate<String> p1, Predicate<String> p2) {
        // 存储筛选后的信息
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = p1.and(p2).test(s);
            if (b == true) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"迪士尼发泡，男", "都不能就，女", "建筑室内哈佛请问，女", "找刺激，男"};
        ArrayList<String> list = filter(arr, (s) -> {
            return s.contains("女");
        }, (s) -> {
            return s.length() ==  6;
        });
        for (String s : list) {
            System.out.println(s);
        }
    }
}

