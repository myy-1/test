package com.ma.queue.leetcode.linklist;

public class CreateListNode {
    public static void main(String[] args) {
        LinkNode l1=new LinkNode(1);
        l1.add(2);//插入结点
        l1.add(3);
        l1.add(4);
        l1.print();

        LinkNode l2=new LinkNode(3);
        l2.add(2);//插入结点
        l2.add(3);
        l2.add(4);
        l2.print();
    }
}
