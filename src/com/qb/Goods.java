package com.qb;

public class Goods implements Comparable{
    private String name;
    private double price;



    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods other = (Goods) o;
            if(this.price > other.price){
                return 1;
            }else if(this.price < other.price){
                return  -1;
            }
            return 0;
        }
        throw new RuntimeException("输入的数据类型不一致");
    }
    
}
