package com.qb;

import java.io.*;

/**
 * @description:
 * @author: 18234
 * @time: 2023/4/4 20:52
 */
public class testOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("user.txt"));
        User user = new User(1, 24, "qiubin");
        output.writeObject(user);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.txt"));
        User user1 = (User)objectInputStream.readObject();
        System.out.println(user1);
        objectInputStream.close();
    }
}
