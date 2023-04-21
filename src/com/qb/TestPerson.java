package com.qb;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        Dog dog = new Dog();
        dog.setNickname("小白");
        person.adopt(dog);
        person.feed();
        Cat cat = new Cat();
        cat.setNickname("小花");
        person.adopt(cat);
        person.feed();
    }
}
