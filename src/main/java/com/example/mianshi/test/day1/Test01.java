package com.example.mianshi.test.day1;

/**
 * 自增变量
 * @author admin
 * @create 2022-09-03
 */
public class Test01 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i="+i+",j="+j+",k="+k);
    }
}
