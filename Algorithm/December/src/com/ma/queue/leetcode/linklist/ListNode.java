package com.ma.queue.leetcode.linklist;

public class ListNode {
    public int data;//链表的数据
    public  ListNode next;//结点

    public ListNode() {
    }

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}
