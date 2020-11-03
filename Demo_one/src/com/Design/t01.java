//package com.Design;
//
//public class t01 {
//
//}
//interface Shape{
//    void draw();
//}
//class Circle implements Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("Draw a Circle");
//    }
//}
//class Rec implements Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("Draw a Rec");
//    }
//}
//class Cube implements Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("Draw a Cube");
//    }
//}
//class ShapeFactory{
//    public Shape getShape(String name){
//        if(name == null){
//            return null;
//        }
//        if(name.equalsIgnoreCase("Cube")){
//            return new Cube();
//        }
//        else if(name.equalsIgnoreCase("rec")){
//            return new Rec();
//        }
//        else if(name.equalsIgnoreCase("Circle")){
//            return new Circle();
//        }
//        return null;
//    }
//
//    public static void main(String[] args) {
//        ShapeFactory sf = new ShapeFactory();
//        var shape1 = sf.getShape("rec");
//        var shape2 = sf.getShape("circle");
//        var shape3 = sf.getShape("cube");
//        shape1.draw();
//        shape2.draw();
//        shape3.draw();
//        //工厂模式的测试
//    }
//}
