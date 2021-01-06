package com.ma.queue.leetcode.demo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo01 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        //迭代器对象Iterator
       Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.println("\t"+it.next());
        }

    }
}
