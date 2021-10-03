package com.company.demo2Lambda;

/*
使用Lambda优化日志案例
Lambda的特点：延迟加载
Lambda的使用前提：必须存在函数式接口
 */
public class Demo02Lambda {
    // 定义一个显示日志的方法,方法的参数传递日志的等级和MessageBuilder接口
    public static void showLog(int level, MessageBuilder mb) {
        // 对日志的等级进行判断，如果是1，输出日志信息
        if (level == 1) {
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        // 定义三个日志信息
        String msg1 = "法外";
        String msg2 = "狂徒";
        String msg3 = "张三";

        // 调用showLog方法，传递日志级别和日志信息
        showLog(1, ()-> msg1+msg2+msg3);
    }
}

