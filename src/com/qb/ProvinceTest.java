package com.qb;

import java.util.Scanner;
import java.util.Set;

public class ProvinceTest {
    public static void main(String[] args) {
        Set keySet = CityMap.model.keySet();
        for(Object s:keySet){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("请选择你所在的省份:");
        Scanner scanner = new Scanner(System.in);
        //接收输入的省份
        String province = scanner.next();
        String[] o = (String[])CityMap.model.get(province);
        for(String city:o){
            System.out.println(city);
        }


    }
}
