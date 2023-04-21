package com.qb;

public class Exer01 {
    //定义一个泛型方法,实现任意引用类型数组指定位置元素交换。
    public static <T> void method(T[] arr,int a ,int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static void main(String[] args) {
        Integer[] integers = {10, 20, 30, 40};
        method(integers,2,3);
        for(Integer integer :integers){
            System.out.println(integer);
        }
    }
}
