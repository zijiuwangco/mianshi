package com.example.mianshi.test.day1;

/**
 * @author admin
 * @create 2022-09-03
 * 延迟创建
 * <p>
 * 1 构造器私有化
 * 2 静态变量保存实例
 * 3 提供静态方法获取实例
 * 4 线程安全的
 */
public class Singleton5 {
    private static Singleton5 INSTANCE;

    private Singleton5() {
    }
    public static Singleton5 getInstance() {
        // 检查是否为空，不为空可以不加锁，提升效率
        if (INSTANCE == null) {
            // 避免并发出现问题
            synchronized (Singleton5.class){
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton5();
                }
            }
        }
        return INSTANCE;
    }

}
