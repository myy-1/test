package com.ma.queue.classloader;
/*
数组定义引用类，引用类并未进行初始化
 */
public class ClassTest2 {
    public static void main(String[] args) {
        ArrayClass[] why=new ArrayClass[10];
    }
}

class ArrayClass{
    static {
        System.out.println(1111);
    }

}
