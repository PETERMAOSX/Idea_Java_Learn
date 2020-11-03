//package com.Design;
//
//public class t04 {
//    public static void main(String[] args) {
//        var object1 = SingleDog.getInstance();
//        object1.show();
//        var object2 = SingleDog.getInstance();
//        object2.show();
//        System.out.println(object1);
//        System.out.println(object2);
//    }
//}
////class SingleDog{
////    private static SingleDog instance;
////    public static SingleDog getInstance(){
////        if(instance == null){
////            return new SingleDog();
////        }
////        else {
////            return null;
////        }
////    }
////}
//class SingleDog{
//    private static SingleDog instance;
//    private SingleDog(){};
//    public static synchronized SingleDog getInstance(){
//        if(instance == null){
//            return new SingleDog();
//        }
//        return null;
//    }
//    public void show(){
//        System.out.println("Show is Working...");
//    }
//}
//
