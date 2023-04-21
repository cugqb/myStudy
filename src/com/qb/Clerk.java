package com.qb;

/**
 * @description: 资源类
 * @author: 18234
 * @time: 2023/4/7 16:11
 */
public class Clerk {
    private int productNum = 0;//产品数量
    private static final int MAX_PRODUCT = 20;
    private static final int MIN_PRODUCT = 1;
    //增加产品数量
    public synchronized void addProduct(){
        if(productNum < MAX_PRODUCT){
            productNum++;
            System.out.println(Thread.currentThread().getName() + "生成了第" + productNum + "个产品");
            //唤醒消费者
            this.notifyAll();
        }else{
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
    //减少产品
    public synchronized void minusProduct(){
        if(productNum >= MIN_PRODUCT){
            System.out.println(Thread.currentThread().getName() + "消费了第" + productNum + "个产品");
            productNum--;
            this.notifyAll();
        }else{
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
