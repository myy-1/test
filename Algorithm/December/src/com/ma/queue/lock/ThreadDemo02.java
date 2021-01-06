package com.ma.queue.lock;

public class ThreadDemo02 extends Thread {
    private Lock m;

    public ThreadDemo02(Lock m) {
        this.m = m;
    }
    public void run(){
        m.runB();
    }
}
