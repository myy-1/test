package com.ma.queue.leetcode.linklist;
/*
如果 l1 或者 l2 一开始就是空链表 ，那么没有任何操作需要合并，
所以我们只需要返回非空链表。否则，我们要判断 l1 和 l2 哪一个链表的头节点的值更小，
然后递归地决定下一个添加到结果里的节点。如果两个链表有一个为空，递归结束。

 */
public class LinkSolution {
    public static void main(String[] args) {


    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.data < l2.data) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

}
