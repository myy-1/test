package com.ma.queue.leetcode;

/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 */

/**
 * 示例 1：
 *
 * 输入：s = "abcd", t = "abcde"
 * 输出："e"
 * 解释：'e' 是那个被添加的字母。
 */
/*
题解：将字符串 ss 中每个字符的 ASCII 码的值求和，得到 A_s
；对字符串 tt 同样的方法得到 A_t。
两者的差值 A_t-A_sA
  即代表了被添加的字符。

 */

/**
 * length:求String字符串数组的长度
 * length():求String字符串的长度
 */
public class FindDifference {
    public static void main(String[] args) {
       /*String s="abcd";
       String t="abcde";
        int snum=0,tnum=0;
        for (int i = 0; i <s.length() ; ++i) {
           snum+=s.charAt(i);

        }
        System.out.println("s字符串的值为" +snum );


        for (int i = 0; i <t.length() ; ++i) {
           tnum+=t.charAt(i);
        }

        System.out.println("t字符串的值为"+tnum);
        char result= (char) (tnum-snum);
        System.out.println("t-s的结果为："+result);*/
       String s="abc";
       String t="abcd";
       char c=findTheDifference(s,t);
        System.out.println(c);
        //return;
}
    public static char findTheDifference(String s, String t) {
        //分别对字符数组串求和
        int svalue = 0, tvalue = 0;

        for (int i = 0; i <s.length() ; i++) {
            svalue+=s.charAt(i);//得到的是一个数值

        }
        for (int i = 0; i < t.length(); ++i) {
            tvalue+=t.charAt(i);//得到的是一个数值


        }
        return (char) (tvalue-svalue);
    }




}
