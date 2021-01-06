package com.ma.queue.leetcode.maxsum;
/*
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
输入: [-2,1,-3,4,-1,2,1,-5,4]
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class Soulution {
    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        int pre = 0, maxAns = a[0];
        int sum=0;
        for (int b:a
             ) {
            pre = Math.max(pre + b, b);
            maxAns = Math.max(maxAns, pre);
            System.out.print(pre+"\t");

        }
        int result = maxSubArray(a);
        System.out.println(result);



    }
    /*
    思路分析：
    1.进行遍历求和，然后进行结果比较
    正确思路：
    1.求出一个数组里最大的和，构成的子数组。
    2.假设 nums 数组的长度是n，下标就是0<i<n-1
    3.我们用 a_i代表nums[i],用 f(i)代表以第i个数结尾的「连续子数组的最大和」。
    4.那么这个最大值的范围就是0<=max<=n-1{f(i-1)}
    5.因此我们只需要求出每个位置的 f(i)，然后返回f数组中的最大值即可。那么我们如何求 f(i)呢？
    我们可以考虑 a_i单独成为一段还是加入 f(i - 1)对应的那一段，
    这取决于 a_i和 f(i - 1) + a_i的大小，我们希望获得一个比较大的，于是可以写出这样的动态规划转移方程：
    f(i)=max{f(i-1)+a_i,a_i}即用一个 f 数组来保存 f(i)的值，
    用一个循环求出所有 f(i)。考虑到 f(i) 只和 f(i - 1)相关，于是我们可以只用一个变量 pre 来维护对于当前 f(i)的 f(i - 1)的值是多少，
    从而让空间复杂度降低到 O(1)，这有点类似「滚动数组」的思想。
     */

    public static int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            //x代表具体的值
            //[-2,1,-3,4,-1,2,1,-5,4]
            //pre前一个值和后一个值相加
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

}
