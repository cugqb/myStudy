package com.qb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestForeach {
    public static void main(String[] args) {
        /*ArrayList coll = new ArrayList();
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        for(Object o : coll){
            System.out.println(o);
        }*/
       /* int[] nums = {1,2,3,4,5};
        for (int num :nums){
            System.out.println(num);
        }
        System.out.println("---------");
        String[] names = {"张三","李四","王五"};
        for (String name:names){
            System.out.println(name);
        }*/
       /* foreach用于遍历Collection和数组.通常只进行遍历元素，
       不要在遍历的过程中对集合元素进行增删操作
       String[] str = new String[5];
        for(String mystr : str){
            mystr = "cug";
            System.out.println(mystr);
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }*/
       /* List<String> list = new ArrayList<String>();
        list.add("图图");
        list.add("小妹");
        list.add("不高兴");
        System.out.println(list);
        list.add(1,"没头脑");
        System.out.println(list);
        System.out.println("删除索引位置为2的元素");
        System.out.println(list.remove(2));
        System.out.println(list);
        list.set(0,"三毛");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
        for(String s :list){
            System.out.println(s);
        }*/
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        List list2 = DuplicateList(list);
        for(Object integer:list2){
            System.out.println(integer);
        }



    }
    public static List DuplicateList(List list){
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        return new ArrayList(hashSet);
    }
}
