package com.qb;

import java.io.File;
import java.io.IOException;

public class FileCreateDelete {
    public static void main(String[] args) throws IOException {
        File file = new File("aaa.txt");
        System.out.println("aaa.txt是否存在:"+file.exists());
        System.out.println("aaa.txt是否创建:"+file.createNewFile());
        System.out.println("aaa.txt是否存在:"+file.exists());
        File f2 = new File("newDir");
        System.out.println("newDir是否存在:"+f2.exists());
        System.out.println("newDir是否创建:"+f2.mkdir());
        System.out.println("newDir是否存在:"+f2.exists());
    }
}
