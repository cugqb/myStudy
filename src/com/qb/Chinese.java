package com.qb;

/**
 * @description: 分析静态代码块 和 非静态代码块的执行顺序
 * @author: 18234
 * @time: 2023/3/15 19:07
 */
public class Chinese {
    private static String country;
    private String name;
    {
        System.out.println("非静态代码块,country = "+ country);
    }

    static{
        country = "中国";
        System.out.println("静态代码块");
    }
    public Chinese(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                '}';
    }
}
