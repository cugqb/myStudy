package com.leetcode;
/*
 * @description:给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * @param null
 * @return:
 * @author: 18234
 * @time: 2023/4/12 10:10
 */
public class Solution {
    public int search(int[] nums, int target){
        if(target < nums[0] || target > nums[nums.length -1]){
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = left + ((right - left) >>1);
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                left = mid +1;
            }
            else if (nums[mid] > target){
                right = mid -1;
            }
        }
        return -1;

    }



}
