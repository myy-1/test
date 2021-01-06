package com.ma.queue.leetcode;

public class 二叉树 {
    int val;
   二叉树 left;
   二叉树 right;
   二叉树() {}
   二叉树(int val) { this.val = val; }
   二叉树(int val, 二叉树 left, 二叉树 right) {
        this.val = val;
        this.left = left;
        this.right = right;
}
}
class Solution{
    public int deep(二叉树 tree){
        if(tree==null){
            return 0;

        }
        int left=deep(tree.left);
        int right=deep(tree.right);
        return left>right?left+1:right+1;
    }

}
