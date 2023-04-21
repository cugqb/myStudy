package com.qb;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestLinkHashMap {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("王五",1300.0);
        linkedHashMap.put("张三",1200.0);
        linkedHashMap.put("张三",1800.0);
        linkedHashMap.put("李四",1300.0);
        String name = null;
        Double salary = null;
        linkedHashMap.put(name,salary);
        Set set = linkedHashMap.entrySet();
        for(Object o :set){
            Map.Entry o1 = (Map.Entry) o;
            System.out.println(o1);
        }
    }
}
