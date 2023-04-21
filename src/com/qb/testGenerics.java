package com.qb;

import java.util.ArrayList;

public class testGenerics {
    public static void main(String[] args) {
        //消除强制类型转换
        //不加泛型
        ArrayList list = new ArrayList();
        list.add("hello");
        //get得到的是一个object对象,必须进行强制类型转换
        String s = (String) list.get(0);
        System.out.println(s);
        /*Object o = list.get(0);
        System.out.println(o);*/
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("world");
        String s1 = list1.get(0);
    }


}
