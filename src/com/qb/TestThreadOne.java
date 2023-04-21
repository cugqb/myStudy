package com.qb;

public class TestThreadOne {
    public static void main(String[] args) {
      /*  使用匿名内部类来创建线程的两种方式
      new Thread("长江") {
            @Override
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName() +"正在执行" +i);
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"正在执行"+i);
                }

            }
        },"黄河").start();
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
        }*/
        System.out.println();
        Thread t = new Thread("获取优先级") {
            @Override
            public void run() {
                System.out.println("当前线程的名称:" + getName() + "当前线程的优先级:" + getPriority());

            }
        };
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority());
    }

}
