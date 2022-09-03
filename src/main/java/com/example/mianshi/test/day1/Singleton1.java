package com.example.mianshi.test.day1;

/**
 * @author admin
 * @create 2022-09-03
 *  1 构造器私有
 *  2 自行创建，静态变量保存
 *  3 向外提供这个实例
 *  4 强调这是单例 可用final修饰
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE  = new Singleton1();
    private Singleton1(){}
}
