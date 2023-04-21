package com.qb;

import java.util.*;

public class DAO <T>{
    private HashMap<String,T> map;
    {
        map = new HashMap<String,T>();
    }
    //保存T类型的对象到map成员变量中
    public void save(String id,T entity){
        if (!map.containsKey(id)){
            map.put(id,entity);
        }

    }
    //从map中获取id对应的对象
    public T get (String id){
        return map.get(id);
    }
    //替换map中key为id的内容，改为entity对象
    public void update(String id,T entity){
        map.replace(id,entity);
    }
    //返回map中存放的所有T对象
    public List<T> list(){
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>(values);
        return list;
    }
    //删除指定id对象
    public void delete(String id){
        map.remove(id);
    }


}
