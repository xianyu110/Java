package com.company.demo2Lambda;

/*
java.lang.Runnable接口就是一个函数式接口
假设有一个startThread方法使用该接口作为参数，可以用Lambda进行传参
 */
public class Demo01Runnable {
    // 定义一个startThread方法使用Runnable接口作为参数
    public static void startThread(Runnable runnable) {
        // 开启多线程
        new Thread(runnable).start();
    }

    public static void main(String[] args) {
        startThread(()-> System.out.println(Thread.currentThread().getName() + "启动") );
    }
}

