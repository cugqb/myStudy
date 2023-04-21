package com.qb;

public class MyExpTest {
    public void regist(int num) throws MyException{
        if(num < 0)
            throw new MyException("人数为负值,不合理",3);
        else
            System.out.println("登记人数" +num);
    }
    public void manager(){
        try {
            regist(-2);
        }catch (MyException e){
            System.out.println("登记失败,出错种类" + e.getId());
        }
        System.out.println("本次登记操作接收");
    }

    public static void main(String[] args) {
        MyExpTest t = new MyExpTest();
        t.manager();

    }
}
