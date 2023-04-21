package com.qb;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollectionAdd {
    public static void main(String[] args) {
        ArrayList coll = new ArrayList();
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        System.out.println(coll);
        System.out.println("集合的个数:"+coll.size());
        ArrayList c1 = new ArrayList();
        c1.add(1);
        c1.add(2);
        coll.add(c1);
        System.out.println(coll);
        System.out.println(coll.size());
        Iterator iterator = coll.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());



    }
}
