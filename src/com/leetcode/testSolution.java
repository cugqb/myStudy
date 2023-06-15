package com.leetcode;

import java.util.Arrays;

/**
 * @description:
 * @author: 18234
 * @time: 2023/5/3 13:10
 */
public class testSolution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        ListNode node5 = new ListNode(1, null);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(4, node3);
        ListNode head = new ListNode(5, node2);
        ListNode listNode = solution.removeElements(head, 3);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

}
