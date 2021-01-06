package com.ma.queue.classloader;
/*
引用一个类的常量，不会触发该类进行初始化
 */
public class ClassTest3 {
    public static void main(String[] args) {
        System.out.println(ConstVariable.TEL);
    }
}
class ConstVariable{
    static {
        System.out.println(1111);
    }
    public static final String TEL="10086";
    public void print(){
        System.out.println("哈哈");
    }

}
