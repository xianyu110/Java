package com.company.demo1FunctionalInterface;

/*
函数式接口的使用：一般可以作为方法的参数和返回值类型
 */
public class Demo {
    // 定义一个方法，参数使用函数式接口MyFunctionInterface
    public static void show(MyFunctionInterface mfi) {
        mfi.method();
    }

    public static void main(String[] args) {
        // 调用show方法
        show(new MyFunctionInterfaceImpl());

        // 传递接口的匿名内部类
        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口的抽象方法");
            }
        });

        // 传递Lambda表达式
        show(()-> System.out.println("传递Lambda表达式"));
    }
}

