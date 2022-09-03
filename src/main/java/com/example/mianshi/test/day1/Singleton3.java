package com.example.mianshi.test.day1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author admin
 * @create 2022-09-03
 * 适合类初始化较复杂情况
 */
public class Singleton3 {
    public static final Singleton3 INSTANCE;
    private String info;
    static {
        Properties properties = new Properties();
        try {
            InputStream inputStream = Singleton3.class.getClassLoader().getResourceAsStream("single.properties");
            properties.load(inputStream);
            INSTANCE = new Singleton3(properties.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private Singleton3(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "info='" + info + '\'' +
                '}';
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
