//package com.Design;
//
//public class t02 {
//}
//interface Shape{
//    void draw();
//}
//
//class Square implements Shape {
//
//
//    @Override
//    public void draw() {
//        System.out.println("Draw a Square");
//    }
//}
//class Circle implements Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("Draw a Circle");
//    }
//}
//class Cube implements Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("Draw a cube");
//    }
//}
//interface Color{
//    void draw();
//}
//class Red implements Color{
//
//    @Override
//    public void draw() {
//        System.out.println("I am Red");
//    }
//}
//class Green implements Color{
//
//    @Override
//    public void draw() {
//        System.out.println("I am Green");
//    }
//}
//class Blue implements Color{
//
//    @Override
//    public void draw() {
//        System.out.println("I am Blue");
//    }
//}
//abstract class AbstractFactory{
//    abstract Color getColor(String colorName);
//    abstract Shape getShape(String shapeName);
//}
//class ShapeFactory extends AbstractFactory{
//
//    @Override
//    Color getColor(String colorName) {
//        return null;
//    }
//
//    @Override
//    Shape getShape(String shapeName) {
//        if(shapeName == null){
//            return null;
//        }
//        if(shapeName.equalsIgnoreCase("square")){
//            return new Square();
//        }
//        else if(shapeName.equalsIgnoreCase("cube")){
//            return new Cube();
//        }
//        else if(shapeName.equalsIgnoreCase("circle")){
//            return new Circle();
//        }
//        return null;
//    }
//}
//class ColorFactory extends AbstractFactory{
//
//    @Override
//    Color getColor(String colorName) {
//        if(colorName == null){
//            return null;
//        }
//        if(colorName.equalsIgnoreCase("red")){
//            return new Red();
//        }
//        else if(colorName.equalsIgnoreCase("green")){
//            return new Green();
//        }
//        else if(colorName.equalsIgnoreCase("blue")){
//            return new Blue();
//        }
//        return null;
//    }
//
//    @Override
//    Shape getShape(String shapeName) {
//        return null;
//    }
//}
//class AbFactory{
//    public static AbstractFactory getFactory(String choice){
//        if(choice == null){
//            return null;
//        }
//        if(choice.equalsIgnoreCase("SHAPE")){
//            return new ShapeFactory();
//        }
//        else if(choice.equalsIgnoreCase("COLOR")){
//            return new ColorFactory();
//        }
//        return null;
//    }
//
//    public static void main(String[] args) {
//        var ShapeFac = AbFactory.getFactory("SHAPE");
//        var shape1 = ShapeFac.getShape("cube");
//        var shape2 = ShapeFac.getShape("circle");
//        var ColorFac = AbFactory.getFactory("COLOR");
//        var color1 = ColorFac.getColor("red");
//        var color2 = ColorFac.getColor("Blue");
//        shape1.draw();
//        shape2.draw();
//        color1.draw();
//        color2.draw();
//    }
//}
