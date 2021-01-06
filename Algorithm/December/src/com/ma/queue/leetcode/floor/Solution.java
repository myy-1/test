package com.ma.queue.leetcode.floor;
/*
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
给定 n 是一个正整数
输入： 2
输出： 2
解释： 有两种方法可以爬到楼顶。
1.  1 阶 + 1 阶
2.  2 阶
我们用 f(x)f(x) 表示爬到第 xx 级台阶的方案数，考虑最后一步可能跨了一级台阶，也可能跨了两级台阶，所以我们可以列出如下式子：

f(x) = f(x - 1) + f(x - 2)
f(x)=f(x−1)+f(x−2)

它意味着爬到第 x级台阶的方案数是爬到第 x - 1 级台阶的方案数和爬到第 x - 2 级台阶的方案数的和。很好理解，因为每次只能爬 1 级或 2 级，所以 f(x) 只能从 f(x - 1) 和 f(x - 2) 转移过来，而这里要统计方案总数，我们就需要对这两项的贡献求和。

以上是动态规划的转移方程，下面我们来讨论边界条件。我们是从第 0 级开始爬的，所以从第 0级爬到第 0级我们可以看作只有一种方案，即 f(0) = 1f(0)=1；从第 0 级到第 1 级也只有一种方案，即爬一级，f(1) = 1。这两个作为边界条件就可以继续向后推导出第 n级的正确结果。我们不妨写几项来验证一下，根据转移方程得到 f(2) = 2 f(3)=3，f(4) = 5......我们把这些情况都枚举出来，发现计算的结果是正确的。

我们不难通过转移方程和边界条件给出一个时间复杂度和空间复杂度都是 O(n)O(n) 的实现，但是由于这里的 f(x)f(x) 只和 f(x - 1)f(x−1) 与 f(x - 2)f(x−2) 有关，所以我们可以用「滚动数组思想」把空间复杂度优化成 O(1)。下面的代码中给出的就是这种实现。
 */
public class Solution {
    public static void main(String[] args) {
        int i = climbStairs(2);
        System.out.println(i);
    }
    public static int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }



}
