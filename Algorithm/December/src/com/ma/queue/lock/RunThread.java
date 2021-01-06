package com.ma.queue.lock;

public class RunThread {
    public static void main(String[] args) {
        Lock lock=new Lock();
        ThreadDemo l=new ThreadDemo(lock);
        ThreadDemo02 m=new ThreadDemo02(lock);

        l.start();
        m.start();
    }
}
