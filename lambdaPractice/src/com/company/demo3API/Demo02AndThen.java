package com.company.demo3API;

import java.util.function.Consumer;

/*
Consumer接口的默认方法andThen
作用：需要两个Consumer接口，可以把两个Consumer接口组合到一起，再对数据进行消费

例如：
    Consumer<String> con1           等价于         con1.andThen(con2).accept(s)谁写前面谁先消费
    Consumer<String> con2
    String s = "Hello"
    con1.accept(s)
    con2.accept(s)


 */
public class Demo02AndThen {
    public static void method(String s, Consumer<String> consumer1, Consumer<String> consumer2) {
//        consumer1.accept(s);
//        consumer2.accept(s);

        // 使用andThen方法把两个接口连接到一起再消费数据
        consumer1.andThen(consumer2).accept(s);
    }

    public static void main(String[] args) {
        method("xnCzo", (s)->{
            // 把字符串转换为大写输出
            System.out.println(s.toUpperCase());
        },(s)->{
            // 把字符串转换为小写输出
            System.out.println(s.toLowerCase());
        });
    }
}

