package com.leetcode;

import java.util.Arrays;

/**
 * @description:
 * @author: 18234
 * @time: 2023/5/3 13:10
 */
public class testSolution {
    public static void main(String[] args) {
//        int[] arr = {1,2,5,7,8,2,3,2};
//        Solution solution = new Solution();
////        int search = solution.search(arr, 3);
////        System.out.println(search);
//        int index = solution.removeElement(arr, 2);
//        System.out.println(index);
        int[] arr = {-5, -1, 0, 1, 7};
        Solution solution = new Solution();
        int[] result = solution.sortedSquare(arr);
        System.out.println("result = " + Arrays.toString(result));

    }

}
