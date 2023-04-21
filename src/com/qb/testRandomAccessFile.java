package com.qb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @description:
 * @author: 18234
 * @time: 2023/4/6 12:10
 */
public class testRandomAccessFile {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File("aaa.txt"), "rw");
        System.out.println("读取之前的偏移量：" + randomAccessFile.getFilePointer() );
        System.out.println("当前读取到的字符：" + (char)randomAccessFile.read());
        System.out.println("读取之后的偏移量: "+ randomAccessFile.getFilePointer());
        randomAccessFile.seek(6);
        System.out.println("读取之前的偏移量：" + randomAccessFile.getFilePointer() );
        System.out.println("当前读取到的字符：" + (char)randomAccessFile.read());
        System.out.println("读取之后的偏移量: "+ randomAccessFile.getFilePointer());

    }
}
