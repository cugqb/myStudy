package com.qb;

public class MyException extends Exception{
    static final long serialVersionUID = 23423423435L;
    private int idnumber;
    public MyException(String message, int id){
        super(message);
        this.idnumber = id;
    }
    public int getId(){
        return idnumber;
    }
}
