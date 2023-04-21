package com.qb;

public class Person {
    private Pet pet;
    public void adopt(Pet pet){
        this.pet = pet;
    }
    public void feed(){
        pet.eat();
    }
}
