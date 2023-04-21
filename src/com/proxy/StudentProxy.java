package com.proxy;

public class StudentProxy implements Person{
    private Student student;

    public StudentProxy(Student student) {
        this.student = student;
    }

    @Override
    public void giveMoney() {
        System.out.println("张三问家人要了60元");
        student.giveMoney();
        System.out.println("剩下10元去网吧上网");
    }
}
