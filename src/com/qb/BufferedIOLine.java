package com.qb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedIOLine {
    public static void main(String[] args) throws IOException {
        //创建流对象
        BufferedReader br = new BufferedReader(new FileReader("aaa.txt"));
        //定义字符串,保存读取的一行文字
        String line;
        //循环读取,读到最后返回null
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        //释放资源
        br.close();
    }
}
