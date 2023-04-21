package com.qb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class testFile {
    public static void main(String[] args)  {
        FileReader f = null;
        try {
            File file = new File("aaa.txt");
            f = new FileReader(file);
            int data;
            //read()方法，从输入流读取一个字符。虽然读取了一个字符,但是会自动提升为int类型。
            // 返回该字符的Unicode编码值。如果已经到达流末尾了,则返回-1
            while((data = f.read()) != -1){
                System.out.println((char)data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(f !=null)
                    f.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
