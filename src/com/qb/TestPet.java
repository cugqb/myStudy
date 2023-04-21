package com.qb;

public class TestPet {
    public static void main(String[] args) {
//      Integer i = new Integer(4);
        Integer i = Integer.valueOf(4);
        i = i + 1;
        System.out.println(i);
        int a = new Integer("12");
        System.out.println(a);
        int k = 10;
        String str = String.valueOf(k);
        System.out.println(str);
        String s1 = "123";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);
        Integer c =1;
        Integer b =1;
        System.out.println(c == b);


    }
}
