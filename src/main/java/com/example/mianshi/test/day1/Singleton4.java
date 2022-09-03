package com.example.mianshi.test.day1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author admin
 * @create 2022-09-03
 * 延迟创建
 * <p>
 * 1 构造器私有化
 * 2 静态变量保存实例
 * 3 提供静态方法获取实例
 * 4
 */
public class Singleton4 {
    private static Singleton4 INSTANCE;

    private Singleton4() {
    }
    public static Singleton4 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton4();
        }
        return INSTANCE;
    }

}
