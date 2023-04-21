package com.qb;

public class TicketSaleThread extends Thread{
    private static int ticket = 100;
    public void run(){
        while(ticket > 0){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            saleOneTicket();
        }
    }
    public synchronized static void saleOneTicket(){
        if(ticket > 0){
            System.out.println(Thread.currentThread().getName() + "卖出一张票，票号"+ticket);
            ticket--;
        }
    }
}
