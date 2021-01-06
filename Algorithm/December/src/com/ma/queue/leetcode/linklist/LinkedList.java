package com.ma.queue.leetcode.linklist;

public class LinkedList {
    //创建一个空链表
    Node head=null;//头结点
    Node last=head;//尾节点
    //递归打印链表
    public void printNode(Node head){
        if(head!=null){
            System.out.println(head.obj);
            Node node=head.next;
            printNode(node);//递归调用

        }
    }
        /*
        向指定链表添加元素的方法
         */
        public void add(Object obj){
            Node node=new Node(obj);//新建结点
            if(head==null){
                head=node;

            }
            else{
                last.next=node;//先把新增节点放在最后
            }
            last=node;//再把最后一个结点往后移
        }
        /*
        向链表中插入新元素的方法，
         */
        public void insert(int index,Object obj){
            Node node=head;
            int i=0;
            while(node!=null&&i<index-2){
                //查找到第index-1个元素
                node=node.next;
                i++;


            }
            Node sert=new Node(obj);
            sert.next=node.next;
            node.next=sert;

        }
    /**
     * 删除指定位置的结点
     */
    public void delete(int index){
        Node node=head;
        int i=0;
        while(node!=null&&i<index-2){
            //查找到第index-1个元素
            node=node.next;
            i++;


        }
        node.next=node.next.next;//删除第index个元素

    }

}


