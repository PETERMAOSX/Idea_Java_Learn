//package com.Design;
//
//public class t03 {
//    public static void main(String[] args) {
//        var object1 = SingleDog.getInstance();
//        object1.show();
//        //单例模式Demo
//        var object2 = SingleDog.getInstance();
//        object2.show();
//        if(object1 == object2){
//            System.out.println("True");
//        }
//    }
//}
//class SingleDog{
//    private static SingleDog instance = new SingleDog();
//    public static int value = 8;
//    public static SingleDog getInstance(){
//        return instance;
//    }
//    public void show(){
//        System.out.println("Hello SingleDog."+value);
//    }
//}
//
