package sort;
/*
 <b>注意! 本题不要遍历二维数组. 要求时间复杂度严格低于n^2, 否则视为不得分 </b>
   * 现有一个n*n的二维正整数数组nums，每行元素保证递增，每列元素保证递增，
   * 求某正整数x是否存在于该二维数组中，需要尽量优化时间和空间复杂度；
   * @param int[][] nums
   * @param int x 目标数
   * @return boolean
   */
/*
解法：以查找数某个数为例，因为矩阵的行和列都是递增的，
所以整个矩阵的对角线上的数也是递增的，故可以在对角线上进行二分查找：
如果要找的数的大小介于对角线上相邻的两个数之间，
则可以排除掉左上和右下的两个小矩阵，
而在左下和右上的两个小矩阵内继续递归查找，
分治法
 */
public class miansi1 {
    public static void main(String[] args) {
        int[][] b={{1,2,3,4},{5,6,7,8},{9,10,11,12},{15,16,17,18}};
        boolean b1 = searchMatrix(b, 22);
        System.out.println(b1);

    }
    public static boolean searchMatrix(int[][] nums, int x) {
        int row=4,col=4;
        int i=0,j=col-1;//后边是j--
         int var=nums[i][j];//[0][3]
        System.out.println(var);
         while(true){
             if(var==x){
                 return true;
             }
             else if(var<x&&i<row-1){
                 var=nums[++i][j];

             }else if(var>x&&j>0){
                 var=nums[i][j--];

             }else{
                 return false;
             }

         }

    }
}
