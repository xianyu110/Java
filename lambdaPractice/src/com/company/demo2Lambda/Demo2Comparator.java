package com.company.demo2Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ChinaManor
 * #Description Demo2Comparator
 * #Date: 2/10/2021 14:10
 */

/*
如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式
当需要通过一个方法来获取java.util.Comparator接口类型的对象作为排序其时，可以调用该方法获取
 */
public class Demo2Comparator {
    public static Comparator<String> getComparator(){
        // 方法的返回值类型是一个接口，那么我们可以返回这个接口的匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                // 按照字符串的长度降序排序
//                return o2.length()-o1.length();
//            }
//        }

        // Lambda优化
        return (o1,o2)->o2.length()-o1.length();
    };

    public static void main(String[] args) {
        // 创建一个字符串数组
        String[] arr = {"cj","hsg","a"};
        // 输出排序前的数组
        System.out.println(Arrays.toString(arr));
        // 调用Arrays中的sort方法对字符串数组排序
        Arrays.sort(arr,getComparator());
        //输出排序后的数据
        System.out.println(Arrays.toString(arr));
    }
}
