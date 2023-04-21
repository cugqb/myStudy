package com.qb;

public class Cat extends Pet{
    @Override
    public void eat(){
        System.out.println("猫" + getNickname() + "吃鱼仔");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
