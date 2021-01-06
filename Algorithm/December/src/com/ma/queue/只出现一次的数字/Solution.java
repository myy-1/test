package com.ma.queue.只出现一次的数字;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: 马月月
 * @Date: 2020/12/31 15:18
 * @Description:
 */
/*
异或运算


 */
public class Solution {
    public static void main(String[] args) {
        int[] b={1,3,1};
        int i = findElement(b);
        System.out.println(i);

    }
  public static int findElement(int[] num){
        int result=0;
      for (int a:num
           ) {
          result^=a;

      }
      return result;
      }

  }

