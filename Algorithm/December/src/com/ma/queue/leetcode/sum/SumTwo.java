package com.ma.queue.leetcode.sum;

/**
 *给定一个整数数组 nums和一个目标值target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 *你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 */
/*
示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */
public class SumTwo {
    public static void main(String[] args) {
        int []b={1,2,3,4};
        int ambition=4;
        int[] a=sum(b,ambition);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }




    }
  public static int[] sum(int[] nums, int target){
      for (int i = 0; i <nums.length; i++) {
          for (int j = i+1; j <nums.length ; j++) {
              if(nums[i]+nums[j]==target){
                  return new int[]{i, j};

              }

          }

      }


        return new int[0];

  }
/*
  public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
*/



    }



