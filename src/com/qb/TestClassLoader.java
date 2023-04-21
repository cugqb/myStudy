package com.qb;

public class TestClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取默认的系统类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
        //查看某个类是哪个类加载器加载的
        ClassLoader classLoader1 = Class.forName("com.qb.TestClassLoader").getClassLoader();
        System.out.println(classLoader1);
        //如果是根加载器加载的类，则会得到Null
        ClassLoader classLoader2 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader2);
        //获取某个类加载器的父加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);
    }
}
