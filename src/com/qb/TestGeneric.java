package com.qb;

import java.util.*;

public class TestGeneric {
    public static void main(String[] args) {
      /*  泛型在list中的应用
      ArrayList<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(76);
        list.add(88);
        list.add(89);
        //当添加非Integer类型的数据时,编译不通过
        //list.add("Tom")//编译报错
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer score = iterator.next();
            System.out.println(score);
        }*/
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Tom",67);
        map.put("Jim",56);
        map.put("Rose",88);
      /*  //遍历key集
        Set<String> keySet = map.keySet();
        for(String s:keySet){
            System.out.println(s);
        }*/
        //遍历value集
       /* 方法一:使用foreach
       Collection<Integer> values = map.values();
        for (Integer value:values){
            System.out.println(value);
        }*/
        /*方法二:使用iterator迭代器
        Collection<Integer> values = map.values();
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }*/
        //遍历entry
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+':'+value);
        }

    }
}
