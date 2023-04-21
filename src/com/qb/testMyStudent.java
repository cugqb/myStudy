package com.qb;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class testMyStudent {
    public static void main(String[] args) throws Exception {
        //获取MyStudent的Class对象
        Class<?> clazz = Class.forName("com.qb.MyStudent");
        //获取属性对象,例如id
        Field idField = clazz.getDeclaredField("id");
        //如果id是私有的等在当前类中不可访问access的，我们需要做如下处理
        idField.setAccessible(true);
        //创建实例对象，即创建MyStudent对象
        Object stu = clazz.newInstance();
        //获取属性值
        Object value = idField.get(stu);
        System.out.println("id ="+value);
        //设置属性值
        idField.set(stu,2);
        value = idField.get(stu);
        System.out.println("id ="+value);
        Method setName = clazz.getDeclaredMethod("setName", String.class);
        //因为setName方法的返回值为void 所以qb应该是null
        Object qb = setName.invoke(stu, "邱斌");
        System.out.println(qb);
        //打印MyStudent类的实例的toString方法 name：邱斌
        System.out.println(stu);
        //获取getId方法的对象
        Method getId = clazz.getDeclaredMethod("getId");
        //调用getId方法
        Object stuId = getId.invoke(stu);
        System.out.println(stuId);
    }
}
