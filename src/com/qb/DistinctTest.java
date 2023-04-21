package com.qb;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行字符串");
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();
        HashSet hashSet = new HashSet();

        hashSet.add(chars);

        for(Object e :hashSet){
            System.out.println(e);
        }

    }
}
