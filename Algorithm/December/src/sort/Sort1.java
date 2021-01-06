package sort;

/**
 * 冒泡排序
 * 原理：比较两个相邻的元素，将值较大的元素交换至右端
 * 思路：依次比较相邻的数，将小数放前边，大数放后边
 * 一直重复，直至排序完成
 */

public class Sort1 {
    public static void main(String[] args) {
        //创建一个一维数组
       int[] b= {50,3,8,9,99,10,0,2,22,20};
        System.out.println("排序前的数组：");
        for (int arr:b) {
            System.out.print("\t"+arr);

        }
        System.out.println();
       //进行冒泡排序
      //最大的放到最后，才叫第一次排序完成
        //i表示轮次
        System.out.println("升序后的数组是：");
        for (int i = 0; i <b.length-1 ; i++) {
            //j表示实际比较的数值
            for (int j = 0; j <b.length-1-i ; j++) {
                if(b[j]>b[j+1]){
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }

            }

        }
        for (int arr:b) {
            System.out.print("\t"+arr);

        }



        //最大的放到最前边，才叫第一次排序完成
        //i表示轮次
        System.out.println();
        System.out.println("降序排序后的数组是：");
        for (int i = 0; i <b.length-1 ; i++) {
            //j表示实际比较的数值
            for (int j = 0; j <b.length-1-i ; j++) {
                if(b[j]<b[j+1]){
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }

            }

        }
        for (int arr:b) {
            System.out.print("\t"+arr);

        }
    }

}
