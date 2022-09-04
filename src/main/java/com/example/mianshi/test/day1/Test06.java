package com.example.mianshi.test.day1;

/**
 * @author admin
 * @create 2022-09-03
 *
 * 就近原则
 *      同名的变量实际为最近的声明变量的那一个，也就说明代码块中的i为上面声明的i
 * 变量的分类
 *      1 成员变量： 类变量 实例变量  2 局部变量
 *      声明的位置
 *          局部变量 方法体{}中  形参中 代码块中
 *          成员变量 类中方法外
 *              类变量 有static修饰
 *              实例变量 没有static修饰
 *      修饰符
 *          局部变量 final
 *          成员变量 访问权限修饰符 final static volatile transient
 *
 *
 * 非静态代码块的执行 每次创建实例对象都会执行
 *
 * 方法的调用规则 调用一次，执行一次
 */
public class Test06 {
    static int s;
    int i;
    int j;
    {
        int i = 1;
        //同名的变量实际为最近的声明变量的那一个，也就说明代码块中的i为上面声明的i
        i++;
        j++;
        s++;
    }
    public void test(int j){
        //同名的变量实际为最近的声明变量的那一个，也就说明代码块中的i为上面声明的i
        j++;
        //此处的i根据变量的作用域，只能是全局变量i
        i++;
        s++;
    }

    public static void main(String[] args) {
        Test06 obj1 = new Test06();
        Test06 obj2 = new Test06();
        obj1.test(10);
        obj1.test(20);
        obj2.test(30);
        System.out.println(obj1.i+","+obj1.j+","+obj1.s);
        System.out.println(obj2.i+","+obj2.j+","+obj2.s);
    }
}
