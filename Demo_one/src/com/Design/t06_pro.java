//package com.Design;
//
//import java.util.Hashtable;
//
//public class t06_pro {
//    public static void main(String[] args) {
//        ShapeCache.loadCache();
//        var clone1 = (Shape) ShapeCache.getshape("1");
//        clone1.draw();
//        Shape clone2 = ShapeCache.getshape("2");
//        clone2.draw();
//        Shape clone3 = ShapeCache.getshape("3");
//        clone3.draw();
//        System.out.println("=============");
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
//        catch(CloneNotSupportedException e){
//            e.printStackTrace();
//        }
//        return clone;
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
//class Rectangle extends Shape{
//
//    public Rectangle(){
//        this.type = "Rectangle";
//    }
//    @Override
//    void draw() {
//        System.out.println("Draw a Rectange");
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
//class ShapeCache{
//    private static Hashtable<String,Shape> shapes = new Hashtable<>();
//    public static void loadCache(){
//        Circle circle = new Circle();
//        circle.setId("1");
//        shapes.put(circle.getId(),circle);
//        Rectangle rectangle = new Rectangle();
//        rectangle.setId("2");
//        shapes.put(rectangle.getId(),rectangle);
//        Square square = new Square();
//        square.setId("3");
//        shapes.put(square.getId(),square);
//    }
//    public static Shape getshape(String id){
//        Shape cache = shapes.get(id);
//        return (Shape) cache.clone();
//    }
//
//}
