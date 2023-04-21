package com.qb;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class testFileReader {
    public static void main(String[] args) {
        FileReader f = null;
        try {
            File file = new File("aaa.txt");
            f = new FileReader(file);
            char[] chars = new char[5];
            int length;
            while ((length = f.read(chars)) != -1) {
                String s = new String(chars, 0, length);
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (f != null)
                    f.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
