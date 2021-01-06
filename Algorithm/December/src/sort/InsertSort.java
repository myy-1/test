package sort;
/*
插入排序是指在待排序的元素中，
假设前面n-1(其中n>=2)个数已经是排好顺序的，
现将第n个数插到前面已经排好的序列中，
然后找到合适自己的位置，
使得插入第n个数的这个序列也是排好顺序的。
按照此法对所有元素进行插入，
直到整个序列排为有序的过程，称为插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] b={9,7,8,3,5,2,6};
        StraightSort(b);
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);

        }


    }
    public static void StraightSort(int[] nums){
        int temp;
        int j;//对有序队列部分进行排序
        int i;//对无序队列部分进行排序
        for ( i = 0; i <nums.length ; i++) {
            temp=nums[i];
            for ( j = i-1; j >=0&&nums[j] >temp; j--) {
                nums[j+1]=nums[j];


            }
            nums[j+1]=temp;

        }

        }

    }




