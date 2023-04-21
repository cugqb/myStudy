package com.qb;

/**
 * @description:
 * @author: 18234
 * @time: 2023/4/7 16:31
 */
public class ConsumerProducerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        Consumer c1 = new Consumer(clerk);
        Consumer c2 = new Consumer(clerk);
        p1.setName("生产者1");
        c1.setName("消费者1");
        c2.setName("消费者2");
        //测试github
        p1.start();
        c1.start();
        c2.start();
    }
}
