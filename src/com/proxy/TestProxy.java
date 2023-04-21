package com.proxy;

public class TestProxy {
    //静态代理
//    public static void main(String[] args) {
//        StudentProxy studentProxy = new StudentProxy(new Student("张三"));
//        studentProxy.giveMoney();
//    }
    //动态代理
    public static void main(String[] args) {
        Person proxy = (Person) new ProxyFactory<Person>(new Student("邱斌")).getProxy();

        proxy.giveMoney();
    }
}
