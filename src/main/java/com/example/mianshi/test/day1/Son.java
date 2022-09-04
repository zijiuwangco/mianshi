package com.example.mianshi.test.day1;

/**
 * @author admin
 * @create 2022-09-03
 * 类初始化过程
 *       一个类要创建实例需要先加载并初始化该类
 *              main方法所在的类需要先加载和初始化
 *       一个子类初始化需要先初始化父类
 *       一个类的初始化就是执行<clinit>()方法
 *              <clinit>()方法由静态类变量显示赋值代码和静态代码块组成
 *              静态类变量显示赋值代码和静态代码块从上到下顺序执行
 *              <clinit>()方法只执行一次
 * 对象实例化过程
 *       实例初始化就是执行<init>()方法
 *              <init>()方法可能重载有多个，有几个构造器就有几个<init>()方法
 *              <init>()方法由非静态实例变量显示赋值代码和非静态代码块，对应构造器代码组成
 *              非静态实例变量显示赋值代码和非静态代码块从上到下顺序执行，而对应构造器的代码最后执行
 *              每次创建实例对象，调用对应构造器，执行的就是对应的<init>()方法
 *              <init>()方法的首行是super（）或super（实参列表），即对应父类的<init>()方法
 *
 *              以下面子类为例，执行顺序为
 *                  行父类构造-super() 最前
 *                  由非静态实例变量显示赋值代码-test() 按照顺序
 *                  非静态代码块-{}
 *                  构造方法-Son() 最后
 * 方法的重载
 *       哪些方法不可以重写
 *              final方法
 *              静态方法
 *              private等子类中不可见方法
 *       对象的多态性
 *              子类如果重写里父类的方法，通过子类对象调用的方法一定是子类重写过得方法
 *              非静态方法默认的调用对象是this
 *              this对象在构造器或者说<init>方法中就是正在创建的对象
 *
 *  所以最终执行顺序
 *  先初始化父类 5 1
 *  再初始化子类 10 6
 *    下面方法由于创建里2次，因此执行里2次
 *  然后调用父类的test方法由于多态，实际调用的是子类的test，也就是 9
 *  调用父类的非静态代码块 3
 *  父类的构造方法 2
 *  子类的test方法 9
 *  子类的非静态代码块 8
 *  子类的构造方法 7
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
