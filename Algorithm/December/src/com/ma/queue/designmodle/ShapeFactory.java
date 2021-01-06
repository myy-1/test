package com.ma.queue.designmodle;
//创建一个工厂
public class ShapeFactory {
    //使用getShape方法取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return  null;

        }
        if(shapeType.equals("CIRCLE")){
            return new Circle();

        }else if(shapeType.equals("RECTANGLE")){
            return new Retangle();

        }else if(shapeType.equals("SQUARE")){
            return new Square();

        }

     return null;
    }
}
