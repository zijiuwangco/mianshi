package com.example.mianshi.test.day1;

import org.junit.Test;

/**
 * @author admin
 * @create 2022-09-03
 * 每次能走1或2步，计算n步可以有多少种走法
 */
public class Test05 {

    @Test
    public void test() throws Exception {
        long s1 = System.currentTimeMillis();
        System.out.println(f(40));
        System.out.println(System.currentTimeMillis()-s1);
        long s2 = System.currentTimeMillis();
        System.out.println(loop(40));
        System.out.println(System.currentTimeMillis()-s2);
    }
    public int f(int n){
        if(n == 1 || n ==2){
            return n;
        }
        return f(n-2) + f(n-1);
    }

    public int loop(int n){
        if(n == 1 || n ==2){
            return n;
        }
        // 最后只走一步的走法
        int one = 2;
        // 最后只走两步步的走法
        int two = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            // 总走法 = 最后只走两步步的走法 + 最后只走一步的走法
            sum = two + one;
            // 下一步，因为加了一步 所以最后走两步的可能为上一次的最后走一步的可能
            two = one;
            // 下一步，因为加了一步 所以最后走一步的可能为上次所以的可能
            one = sum;
        }
        return sum;
    }

}
