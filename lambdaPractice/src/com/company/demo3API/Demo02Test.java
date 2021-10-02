package com.company.demo3API;

import java.util.function.Supplier;

/*
练习：求数组元素的最大值
    使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值
    提示：接口的泛型请使用java.lang.Integer类
 */
public class Demo02Test {
    // 定义一个方法，用于获取int类型数组中元素的最大值，方法的参数传递Supplier接口，泛型使用Integer
    public static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        int[] arr = {4,26,56,45,7,2};
        int maxNum = getMax(() -> {
            // 获取数组的最大值并返回
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println("最大值是" + maxNum);
    }
}

