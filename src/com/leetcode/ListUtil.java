package com.leetcode;

/**
 * @description:
 * @author: 18234
 * @time: 2023/6/6 9:48
 */
public class ListUtil {

    public static int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        return length;
    }


    /**
     * @description: 获取链表中第 index 个节点的值。如果索引无效，则返回-1
     * @param index
     * @param head
     * @return: int
     * @author: 18234
     * @time: 2023/6/6 10:12
     */
    public static int getValue(int index, ListNode head) {
        int listIndex = 0;

        while (head != null) {
            if (listIndex++ == index){
                return head.val;
            }
            head = head.next;
        }

        return -1;

    }

    public static ListNode addAtHead(int val, ListNode head){
        ListNode newHead = new ListNode(val, head);
        return newHead;
    }

    public static ListNode addAtTail(int val, ListNode head) {
        ListNode cur = head;
        while (head.next != null) {
            head = head.next;
        }
        head.next = new ListNode(val, null);
        return cur;

    }

    public static ListNode addAtIndex(int index, int val, ListNode head) {
        int listIndex = 1;
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode node = new ListNode(val, null);
        if (index <= 0) {
            return new ListNode(val, head);
        }
        if (index > ListUtil.getLength(head) ){
            return head;
        }
        while (cur != null) {
            if (listIndex++ == index) {
                pre.next = node;
                node.next = cur;
            }
            pre = cur;
            cur = cur.next;
        }
        return head;
    }

    public static ListNode deleteAtIndex(int index, ListNode head) {
        ListNode pre = head;
        ListNode cur = head.next;
        int listIndex = 1;
        if (index == 0) {
            head = head.next;
            return head;
        }
        if (index < 0 || index >= ListUtil.getLength(head) ){
            return head;
        }
        while (cur != null) {
            if (listIndex++ == index) {
              pre.next = cur.next;
            }
            pre = cur;
            cur = cur.next;
        }
        return head;

    }

}
