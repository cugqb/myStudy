package com.qb;

import java.text.SimpleDateFormat;
import java.util.Date;

public class testString {
    String name;
    public void testString(){

    }
}
class testOne{
    public static void main(String[] args) {
        /*testString p1 = new testString();
        p1.name = "tom";
        testString p2 = new testString();
        p2.name = "tom";
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);
        System.out.println(p1.name == "tom");*/
    /*    String s1 = "hello";
        String s2 = "world";
        String s3 = "hello" + "world";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = (s1 + s2).intern();
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s4 == s5);
        System.out.println(s3 == s6);
        结论：常量+常量：结果是常量池。且常量池中不会存在相同内容的常量
             常量与变量 或 变量与变量 结果在堆中
             拼接后调用intern方法 返回值在常量池中
        */

      /*  char[] data = {'h','e','l','l','o','t','o','m'};
        String s = String.copyValueOf(data);
        System.out.println(s);
        String s1 = String.copyValueOf(data, 0, 5);
        System.out.println(s1);*/
        /*StringBuilder s = new StringBuilder();
        s.append("hello").append(true).append(12);
        System.out.println(s);*/
       /* 显示日期
       Date d = new Date();
        System.out.println(d);*/

        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时mm 分");
        String str = sf.format(d);
        System.out.println(str);



    }
}