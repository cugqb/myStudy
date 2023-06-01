package com.leetcode;

public class Solution {
    /**
     * @description: 二分查找
     * @param nums
     * @param target
     * @return: int
     * @author: 18234
     * @time: 2023/5/3 20:14
     */
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
    /**
     * @description: 移除元素
     * 给定一个数组nums和一个值val,
     * 你需要原地移除所有数值等于val的元素,并返回移除后的数组的新长度。
     * @param nums
     * @param val
     * @return: int
     * @author: 18234
     * @time: 2023/5/3 20:39
     */
    public int removeElement(int[] nums, int val){
       int slowIndex = 0;
       for(int fastIndex = 0; fastIndex < nums.length; fastIndex++){
           if(nums[fastIndex] != val){
               nums[slowIndex] = nums[fastIndex];
               slowIndex++;
           }
       }
       return slowIndex;

    }

    public int[] sortedSquare(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int[] result = new int[nums.length];
        int index = result.length - 1;
        while (left <= right) {
            if ((nums[right] * nums[right]) < (nums[left] * nums[left])) {
                result[index--] = nums[left] * nums[left];
                ++left;
            } else {
                result[index--] = nums[right] * nums[right];
                --right;
            }

        }
        return result;

    }



}
