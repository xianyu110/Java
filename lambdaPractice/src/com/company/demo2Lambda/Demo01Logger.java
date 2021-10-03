package com.company.demo2Lambda;

/*
日志案例

发现以下代码存在性能浪费
先拼接好字符串再调用showLog方法，如果日志的等级不是1，则不会输出拼接后的字符串，存在性能的浪费
 */
public class Demo01Logger {
    // 定义一个根据日志的级别写是日志信息的方法
    public static void showLog(int level, String message) {
        // 对日志的等级进行判断，如果是1，输出日志信息
        if (level == 1) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        // 定义三个日志信息
        String msg1 = "法外";
        String msg2 = "狂徒";
        String msg3 = "张三";

        // 调用showLog方法，传递日志级别和日志信息
        showLog(1,msg1+msg2+msg3);
    }
}

