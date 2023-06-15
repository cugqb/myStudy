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

    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s){
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];

            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public int[][] generateMatrix(int n){
        int loop = 0; //控制循环次数
        int[][] res = new int[n][n];
        int start = 0; //每次循环开始的点
        int count = 1; //定义填充数字
        int i,j;
        while (loop++ < n / 2) { // 判断边界后，loop从1开始
            // 模拟上侧从左到右
            for (j = start; j < n - loop ; j++){
                res[start][j] = count++;
            }
            // 模拟右侧从上到下
            for (i = start; i < n - loop; i++){
                res[i][j] = count++;
            }
            //模拟下侧从左到右
            for(; j >= loop; j--){
                res[i][j] = count++;

            }
            //模拟左侧从下到上
            for (; i >= loop; i--){
                res[i][j] = count++;
            }
            start++;
        }

        if (n % 2 == 1){
            res[start][start] = count;
        }

        return res;


    }

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        //已经为null,提前退出
        if (head == null) {
            return head;
        }
        //已经确定当前head.val != val
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return head;

    }

    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode cur = head;
       ListNode temp = null;
       while (cur != null) {
            temp = cur.next; //保存下一个节点
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
       return prev;
    }

    public ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode(-1); //设置一个虚拟结点
        newHead.next = head; //将虚拟头结点指向head,z这样方面后面做删除操作
        ListNode cur = newHead;
        ListNode temp; //临时结点，保存两个节点后面的结点
        ListNode firstNode; //临时结点，保存两个节点之中的第一个节点
        ListNode secondNode; //临时结点，保存两个节点之中的第二个节点
        while (cur.next != null && cur.next.next != null) {
            temp = cur.next.next.next;
            firstNode = cur.next;
            secondNode = cur.next.next;
            cur.next = secondNode;       //步骤一
            secondNode.next = firstNode; //步骤二
            firstNode.next = temp;        //步骤三
            cur = firstNode;              //cur移动,准备下一轮交换
        }
        return newHead.next;
    }

    public ListNode deleteNumberNode(ListNode head,int n){
        ListNode cur = head;
        ListNode frontNode = head;
        ListNode nextNode = head;
        ListNode lastNode = null;
        while (frontNode.next != null) {
            if (n == 0) {
                lastNode = nextNode;
                nextNode = nextNode.next;
            }

            frontNode = frontNode.next;
            n--;
        }
        lastNode.next = nextNode.next;
        return cur;

    }

    public ListNode commonNode(ListNode head1, ListNode head2) {
        int length1 = 0;
        int length2 = 0;
        int n = 0;
        ListNode temp = head1;
        while(head1 != null){
            head1 = head1.next;
            length1++;
        }

        while(head2 != null){
            head2 = head2.next;
            length2++;
        }

        n = Math.abs(length1 - length2);

        if (length1 >=  length2) {
            for (int i = 0; i < n; i++){
                head1 = head1.next;
            }

        }else {
            for (int i = 0; i < n; i++){
                head2 = head2.next;
            }

        }

        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
            temp = head1;
        }

        return temp;
    }


    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) { //判断是否有环
                ListNode index1 = fast;
                ListNode index2 = slow;
                while (index1 != index2) { //
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
    }


}
