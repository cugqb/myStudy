package com.qb;

public class Dog extends Pet{
    @Override
    public void eat(){
        System.out.println("狗子"+getNickname()+"啃骨头");
    }
    public void WatchHouse(){
        System.out.println("看家");
    }
}
