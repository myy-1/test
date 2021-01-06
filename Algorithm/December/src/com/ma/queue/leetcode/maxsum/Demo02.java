package com.ma.queue.leetcode.maxsum;

public class Demo02 {
    public static void main(String[] args) {
        int [] b={1,-2,3};
        int result=sumArr(b);
        System.out.println(result);



    }
    public static int sumArr(int [] nums){
        int pre=0,maxvalue=nums[0];
        for (int b:nums
             ) {
            pre=Math.max(pre+b,b);
            maxvalue=Math.max(maxvalue,pre);
        }
        return maxvalue;
    }
}
