//package com.Design;
//
//import java.util.Hashtable;
//
//public class t06 {
//    public static void main(String[] args) {
//        ShapeCache.loadCache();
//        Shape clonedShape = (Shape) ShapeCache.getShape("1");
//        System.out.println("Shape: "+clonedShape.type);
//        Shape cloneShape2 = (Shape) ShapeCache.getShape("2");
//        System.out.println("Shape: "+cloneShape2.type);
//        Shape cloneShape3 = (Shape) ShapeCache.getShape("3");
//        System.out.println("Shape: "+cloneShape3.type);
//    }
//}
//abstract class Shape implements Cloneable{
//    private String id;
//    protected String type;
//    abstract void draw();
//    public String getType(){
//        return this.type;
//    }
//    public String getId(){
//        return this.id;
//    }
//    public void setId(String id){
//        this.id = id;
//    }
//    public Object clone(){
//        Object clone = null;
//        try{
//            clone = super.clone();
//        }
//        catch (CloneNotSupportedException e){
//            e.printStackTrace();
//        }
//        return clone;
//    }
//
//}
//class Rectangle extends Shape{
//
//    @Override
//    void draw() {
//        System.out.println("Draw a Rectangle");
//    }
//    public Rectangle(){
//        this.type = "rectangle";
//    }
//}
//class Square extends Shape{
//    public Square(){
//        this.type = "Square";
//    }
//
//    @Override
//    void draw() {
//        System.out.println("Draw a Square");
//    }
//}
//class Circle extends Shape{
//    public Circle(){
//        this.type = "Circle";
//    }
//
//    @Override
//    void draw() {
//        System.out.println("Draw a Circle");
//    }
//}
//class ShapeCache{
//    public static Hashtable<String,Shape> shapeMap = new Hashtable<>();
//    public static Shape getShape(String shapeid){
//        Shape cachedShape = shapeMap.get(shapeid);
//        return (Shape) cachedShape.clone();
//    }
//    public static void loadCache(){
//        Circle circle = new Circle();
//        circle.setId("1");
//        shapeMap.put(circle.getId(),circle);
//
//        Square square = new Square();
//        square.setId("2");
//        shapeMap.put(square.getId(),square);
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.setId("3");
//        shapeMap.put(rectangle.getId(),rectangle);
//    }
//}
