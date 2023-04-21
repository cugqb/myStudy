package com.qb;

/**
 * @description: 懒汉式加载
 * @author: 18234
 * @time: 2023/3/13 14:59
 */
public class Lanhanshi {
    //创建一个私有的构造方法
    private Lanhanshi(){

    }
    //创建一个私有的静态变量
    private static Lanhanshi lanhanshi ;
    //提供一个公共的静态方法,返回当前类的对象
    public static Lanhanshi getLanhanshi(){
        if (lanhanshi == null){
            lanhanshi = new Lanhanshi();
        }
        return lanhanshi;
    }
}
