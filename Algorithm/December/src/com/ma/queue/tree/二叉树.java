package com.ma.queue.tree;

import java.util.ArrayList;
import java.util.List;

public class 二叉树 {
    private  二叉树 root;
    private Object data;
    private 二叉树 left;
    private 二叉树 right;

    public 二叉树 getRoot() {
        return root;
    }

    public void setRoot(二叉树 root) {
        this.root = root;
    }

    public Object getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public 二叉树 getLeft() {
        return left;
    }

    public void setLeft(二叉树 left) {
        this.left = left;
    }

    public 二叉树 getRight() {
        return right;
    }

    public void setRight(二叉树 right) {
        this.right = right;
    }



    public 二叉树(Object data) {
        this.data = data;
    }

    public 二叉树() {
    }

    //初始化二叉树
    public void create(Object[] tree){
        //新建一个集合，将数据变为各个节点
        List<二叉树> list=new ArrayList<二叉树>();
        for (Object twotree:tree) {
            list.add(new 二叉树(twotree));

        }
        //设置根节点
        root=list.get(0);
        //利用构建完全二叉树的方式构建
        for (int i = 0; i < tree.length/2; i++) {
            if(i*2+1<list.size()){
              list.get(i).setLeft(list.get(i*2+1));
            }else if(i*2+2<list.size()){
               list.get(i).setRight(list.get(i*2+2));

            }

        }

    }
    //前序遍历二叉树
    public void pre(二叉树 root){
        if(root!=null){
            System.out.println(root.getData());



        }

    }
}
