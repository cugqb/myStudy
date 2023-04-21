package com.qb;

/**
 * @description:
 * @author: 18234
 * @time: 2023/4/7 16:09
 */
public class Producer extends Thread{
    private Clerk clerk;
    public Producer(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        System.out.println("======生产者开始生产产品=======");
        while (true){
            try{
                Thread.sleep(40);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            //要求clerk去增加商品
            clerk.addProduct();
        }


    }
}
