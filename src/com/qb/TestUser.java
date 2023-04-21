package com.qb;

import java.util.List;

public class TestUser {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("1001",new User(1,43,"曹操"));
        dao.save("1002",new User(2,33,"刘备"));
        dao.save("1003",new User(3,24,"孙权"));
        dao.update("1002",new User(2,23,"刘婵"));
        dao.delete("1003");
        List<User> list = dao.list();
        for (User u :list){
            System.out.println(u);
        }

    }
}
