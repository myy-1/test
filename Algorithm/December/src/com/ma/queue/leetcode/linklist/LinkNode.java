package com.ma.queue.leetcode.linklist;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;

//定义链表
public class LinkNode {
    public int data;//数值
    public LinkNode next;//结点
    public Object object;//结点元素


    public LinkNode(int data) {
        this.data = data;
    }

    //添加新的结点
    public void add(int newval){
        LinkNode linkNode=new LinkNode(newval);

        if(this.next==null){
            this.next=linkNode;
         }
         else
             this.next.add(newval);

    }
    //打印链表
    public void print(){
        System.out.println(this.data);
        if(this.next!=null){
            System.out.print("->");
            this.next.print();
        }


            }

    }


