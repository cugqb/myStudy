package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @description:
 * @author: 18234
 * @time: 2023/6/15 13:35
 */
public class HashQuestion {
    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];

        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i) - 'a']--;
        }

        for (int count : record) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> commonArray(int[] arr1, int[] arr2) {
        int[] result = new int[100];
        ArrayList<Integer> list = new ArrayList<>();
        for (int value: arr1) {
            if (result[value] != 1) {
                result[value]++;
            }

        }
        for (int value : arr2) {
            if (result[value] != 2) {
                result[value]++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] == 2) {
                list.add(i);
            }
        }
        return list;

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resSet = new HashSet<>();
        for (int i: nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if (set1.contains(1)) {
                resSet.add(1);
            }
        }
        int j = 0;
        int[] arr = new int[resSet.size()];
        for (int i : resSet) {
            arr[j++] = i;
        }

        return arr;
    }


    public boolean happyNum(int n) {

        HashSet<Integer> record = new HashSet<>();

        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = getNextNumber(n);
        }

        return n == 1;

    }

    public int getNextNumber(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }
}
