package com.ma.queue.classloader;
/*
子类调用父类的静态方法，子类不会进行初始化
 */
public class ClassTest1 {
    public static void main(String[] args) {
        System.out.println(SubClass.num);
//        SubClass subClass=new SubClass();
//        System.out.println(SubClass.num);
    }
}
class SubClass extends SuperClass{
    static {
        System.out.println(111111111);
    }
}
class SuperClass{
    static{
        System.out.println(3);
    }
    static int num=100;
}
