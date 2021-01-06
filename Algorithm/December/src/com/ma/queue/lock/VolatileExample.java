package com.ma.queue.lock;

public class VolatileExample {
    public static void main(String[] args) {
        Thread thread=new Thread();
        thread.start();//主线程

        for (int i = 0; i <2 ; i++) {
            System.out.println("主线程执行");

        }



    }
}
