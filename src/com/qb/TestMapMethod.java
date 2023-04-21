package com.qb;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMapMethod {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("许仙", "白娘子");
        map.put("董永", "七仙女");
        map.put("牛郎", "织女");
        map.put("许仙", "小青");
       /* //添加元素到集合
        System.out.println(map);
        //删除指定的key-value
        System.out.println(map.remove("黄晓明"));
        System.out.println(map);
        //查询指定key 对应的value
        System.out.println(map.get("邓超"));
        System.out.println(map.get("黄晓明"));
    }*/
        System.out.println("所有的key");
        Set set = map.keySet();
        for(Object s:set){
            System.out.println(s);
        }
        System.out.println("所有的value");
        Collection values = map.values();
        for(Object val:values){
            System.out.println(val);
        }
        System.out.println("所有的映射关系");
        Set set1 = map.entrySet();
        for(Object s1:set1){
            Map.Entry s11 = (Map.Entry) s1;
            System.out.println(s11.getKey()+":"+s11.getValue());
        }    }
}
