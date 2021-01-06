package sort;
/*
基数排序
1.先看个位，根据个位的数把他放到对应的下标位置
2.再看十位，根据十位，把他的数放到对应的下标位置
3.一直重复以上步骤，一次排序完成就换一下要看的位数，直至排完为止
 */
public class JishuSort {
    public static void main(String[] args) {
        int[] a = {88, 7, 10, 9, 22, 37, 51};
        sort(a, 2);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");

        }
    }

    public static void sort(int[] number, int d) //d表示最大的数有多少位
    {
        int k = 0;
        int n = 1;//取个位，十位，百位
        int m = 1; //控制键值排序依据在哪一位,从个位，十位，百位开始
        int[][] temp = new int[10][number.length]; //数组的第一维表示可能的余数0-9
        int[] order = new int[10]; //数组order[i]用来表示该位是i的数的个数，用来放一个位上叠加的数
        //对temp数组操作
        while (m <= d) {
            for (int i = 0; i < number.length; i++) {
                int lsd = ((number[i] / n) % 10);//余数
                temp[lsd][order[lsd]] = number[i];
                order[lsd]++;
            }
            //对order数组操作
            for (int i = 0; i < 10; i++) {
                if (order[i] != 0)
                    for (int j = 0; j < order[i]; j++) {
                        number[k] = temp[i][j];
                        k++;
                    }
                order[i] = 0;
            }
            n *= 10;
            k = 0;
            m++;
        }
    }
}
