package com.ma.queue.lock;



public class Lock {
   public void runA(){
       synchronized(this){

       System.out.println("线程A开始时间："+System.currentTimeMillis());
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

           System.out.println("线程A结束时间："+System.currentTimeMillis());
   }
   }
  public void runB(){
      synchronized(this){

          System.out.println("线程B开始时间："+System.currentTimeMillis());

          System.out.println("线程B结束时间："+System.currentTimeMillis());
      }
  }
}
 class  ThreadDemo extends  Thread{
    private Lock l;

     public ThreadDemo(Lock l) {
         this.l = l;
     }
     public void run(){
         l.runA();
     }
 }
