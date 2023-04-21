package com.qb;

/**
 * @description:
 * @author: 18234
 * @time: 2023/4/7 16:28
 */
public class Consumer extends Thread{
    private Clerk clerk;
    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        System.out.println("=====消费者消费了产品=====");
        while (true){
            try {
                Thread.sleep(90);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //要求clerk去减少产品
            clerk.minusProduct();
        }
    }
}
