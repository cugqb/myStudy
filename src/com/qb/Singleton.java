package com.qb;

/**
 * @description: 饿汉式创建单例
 * @author: 18234
 * @time: 2023/3/13 14:46
 */
public class Singleton {
    //使用一个私有的构造器
    private Singleton (){

    }
    //将实例存储在私有的类变量中
    private static Singleton singleton = new Singleton();
    //提供公共的静态的方法,返回当前类的对象
    //特点:立即加载,即在使用类的时候已经将对象创建完毕
    //优点:实现起来简单,没有多线程的安全问题
    //缺点:当类被加载的时候,会初始化static的实例，静态变量被创建并分配内存空间,从这以后,
    //这个static的实例便一直占着这块内存,直到类被卸载，静态变量被摧毁，并释放所占有的内存
    //因此在某些特点条件会耗费内存
    public static Singleton getSingleton(){
        return singleton;
    }
}
