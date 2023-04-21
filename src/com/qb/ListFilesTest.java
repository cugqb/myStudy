package com.qb;

import java.io.File;

public class ListFilesTest {
    public static void printSubFile(File dir){
        File[] files = dir.listFiles();
        for(File file:files){
            if(file.isDirectory()){
                printSubFile(file);
            }else{
                System.out.println(file.getAbsoluteFile());
            }

        }

    }
}
