package com.qb;

public class TestStudent {
    public static void main(String[] args) {
        //语文老师使用时:
        Student<String> stu = new Student<String>("张三", "良好");
        //数学老师使用时:
        Student<Double> stu2 = new Student<Double>("张三", 90.5);
        //英语老师使用时:
        Student<Character> stu3 = new Student<>("张三", 'C');

        System.out.println(stu);
        System.out.println(stu2);
        System.out.println(stu3);


    }
}
