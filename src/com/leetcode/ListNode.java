package com.leetcode;

/**
 * @description:
 * @author: 18234
 * @time: 2023/6/4 20:44
 */
public class ListNode {
    //节点的值
    int val;

    //下一个节点
    ListNode next;

    //节点的无参构造
    public ListNode(){

    }

    //节点的构造函数（有一个参数）
    public ListNode(int val) {
        this.val = val;
    }

    //节点的构造函数（有两个参数）
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
