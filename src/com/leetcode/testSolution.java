package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @description:
 * @author: 18234
 * @time: 2023/5/3 13:10
 */
public class testSolution {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 2, 34, 4, 5);
        Stream<Integer> stream = myList.stream().filter(value -> value > 2);
        Integer[] a = stream.toArray(Integer[]::new);
        for (Integer integer : a) {
            System.out.println(integer);
        }

    }

}
