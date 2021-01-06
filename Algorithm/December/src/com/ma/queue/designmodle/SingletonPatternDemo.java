package com.ma.queue.designmodle;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译错误，构造函数SingleObject是不可见的
        //SingleObject object=new SingleObject();

        //获取唯一可用的对象
        SingleObject object=SingleObject.getInstance();

        //显示消息
        object.showMessage();
    }
}
