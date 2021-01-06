package com.ma.queue.数据结构;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 马月月
 * @Date: 2020/12/31 16:29
 * @Description:
 */
public class 二叉树 {
    private 二叉树 node;
    private 二叉树 left;
    private 二叉树 right;
    private Object data;

    public 二叉树() {
    }

    public 二叉树(Object data) {
        this.data = data;
    }

    public 二叉树 getNode() {
        return node;
    }

    public void setNode(二叉树 node) {
        this.node = node;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    //初始化二叉树
    public void twotree(Object[] tree){
        List<二叉树> list=new ArrayList<二叉树>();
        for (Object two:tree
             ) {
            list.add(new 二叉树( two));

        }
       node=list.get(0);
        //构建二叉树
        for (int i = 0; i <tree.length/2 ; i++) {
            if(i*2+1<+list.size()){

            }

        }
    }


}
