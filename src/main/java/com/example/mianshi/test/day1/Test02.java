package com.example.mianshi.test.day1;

import java.util.concurrent.*;

/**
 * 单例设计模式
 * @author admin
 * @create 2022-09-03
 */
public class Test02 {
    /**
     * 1 某个类只能有一个实例
     *      构造器私有化
     * 2 它必须自行创建这个实例
     *      含有一个该类的静态变量来保存这个唯一的实例
     * 3 它必须自行向整个系统提供这个实例
     *      对外提供获取该实例对象的方法
     *          直接暴露
     *          用静态变量的get方法获取
     */
    /**
     * 几种常见形式
     * 饿汉式 直接创造对象，不存在线程安全问题
     *      直接实例化饿汉式 简介直观
     *      枚举式 最简洁
     *      静态代码块饿汉式 适合复杂实例化
     * 懒汉式 延迟创建对象
     *      线程不安全式 适合单线程
     *      线程安全式 适合多线程
     *      静态内部类形式 社和多线程
     *
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Singleton1 s1 = Singleton1.INSTANCE;
//        Singleton1 s2 = Singleton1.INSTANCE;
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1 == s2);

//        Singleton2 s3 = Singleton2.INSTABCE;
//        Singleton2 s4 = Singleton2.INSTABCE;
//        // 枚举类型没重写toString方法 打印的是枚举的名字
//        System.out.println(s3);
//        System.out.println(s4);
//        System.out.println(s3 == s4);

//        Singleton3 s5 = Singleton3.INSTANCE;
//        Singleton3 s6 = Singleton3.INSTANCE;
//        System.out.println(s5);
//        System.out.println(s6);
//        System.out.println(s5 == s6);

//        Callable<Singleton4> c = () -> Singleton4.getInstance();
//        ExecutorService es = Executors.newFixedThreadPool(2);
//        Future<Singleton4> f1 = es.submit(c);
//        Future<Singleton4> f2 = es.submit(c);
//        Singleton4 s1 = f1.get();
//        Singleton4 s2 = f2.get();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1 == s2);
//        es.shutdown();

        Callable<Singleton5> c = () -> Singleton5.getInstance();
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton5> f1 = es.submit(c);
        Future<Singleton5> f2 = es.submit(c);
        Singleton5 s1 = f1.get();
        Singleton5 s2 = f2.get();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        es.shutdown();

    }
}
