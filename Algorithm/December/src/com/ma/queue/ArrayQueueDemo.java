package com.ma.queue;
import java.io.IOException;
import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        //测试一下
        //创建一个队列
        ArrayQueue queue = new ArrayQueue(3);
        char key = ' ';//接受用户输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        //输出一个菜单
        while (loop) {
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):从队列取出数据");
            System.out.println("h(head):查看队列头的数据");
            key = scanner.next().charAt(0);//接收到一个字符
            switch (key) {
                case 's':
                   queue.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入一个数");
                    int value = scanner.nextInt();
                    queue.insertQueue(value);
                    break;
                case 'g':
                    try{
                        int result=queue.getQueue();
                        System.out.println("取出的数据是"+result);
                    }catch (Exception e){
                        System.out.println(e.getMessage());

                    }
                    break;
                case 'h'://查看队列头
                    try{
                        int head = queue.showHead();
                        System.out.println("头部数据为："+head);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop=false;
                    default:
                        break;




            }
        }
        System.out.println("退出程序 拜拜");

    }
}

    //创建数组队列
    class ArrayQueue {
        private int Size;//数组的长度
        private int front;//指向数组头的前一个位置
        private int rear;//指向数组尾
        private int[] arr;//创建数组

        //创建数组构造器
        public  ArrayQueue(int maxSize) {
            Size = maxSize;
            arr = new int[maxSize];
            front = -1;
            rear = -1;

        }

        //判断队列是否满
        public boolean isFull() {
            return rear == Size - 1;
        }

        //判断队列是否为空
        public boolean isEmpty() {
            return rear == front;
        }

        //往队列插入元素
        public void insertQueue(int n) {
            //判断队列是否满
            if (isFull()) {
                System.out.println("队列已满，不能插入了");
                return;
            }
            rear++;
            arr[rear] = n;

        }

        //从队列取元素
        public int getQueue() {
            //判断队列是否为空
            if (isEmpty()) {

                throw new RuntimeException("队列是空的，不能取元素");
            }
            front++;
            return arr[front];
        }

        //展示队列
        public void showQueue() {
            //遍历队列
            if (isEmpty()) {
                System.out.println("队列是空的，没有元素");

            }else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("arr"+"["+i+"]"+"="+arr[i]);
            }
            }
        }

        //展示队列头元素
        public int showHead() {
            //判断是否为空
            if (isEmpty()) {
                throw new RuntimeException("队列中没有元素");


            }
          return arr[front+1];
            }
        }


