package com.qb;

public class TestThrow {
    public static void main(String[] args) {
       /* System.out.println("上课....");
        try{
            afterClass();
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("准备提前上课");
        }
        System.out.println("上课.....");*/
        try {
            System.out.println(max(4,2,31,1));
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            System.out.println(max(4));
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            System.out.println(max());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    /*public static void afterClass() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }*/
    public static int max(int... nums){
        if(nums ==null || nums.length == 0){
            throw new IllegalArgumentException("没有传入任何整数,无法获得取最大值");
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
