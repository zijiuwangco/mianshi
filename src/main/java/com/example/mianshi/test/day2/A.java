package com.example.mianshi.test.day2;

import java.util.stream.Stream;

/**
 * @author admin
 * @create 2022-09-04
 */
public class A {
    public static void main(String[] args) {
        Stream.of(1,2,1).filter(integer -> integer==2).forEach(System.out::println);
    }
}
