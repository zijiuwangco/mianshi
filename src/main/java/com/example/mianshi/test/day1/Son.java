package com.example.mianshi.test.day1;

/**
 * @author admin
 * @create 2022-09-03
 * 类初始化过程
 *       一个类要创建实例需要先加载并初始化该类
 * 对象实例化过程
 *
 * 方法的重载
 */
public class Son extends Father{
    private int i = test();
    private static int j = method();
    static {
        System.out.println("(6)");
    }
    Son(){
        System.out.println("(7)");
    }
    {
        System.out.println("(8)");
    }

    public static int method() {
        System.out.println("(10)");
        return 1;
    }

    public int test() {
        System.out.println("(9)");
        return 1;
    }
}
