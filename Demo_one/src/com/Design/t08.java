//package com.Design;
//
//public class t08 {
//    public static void main(String[] args) {
//        var Totalfac = new TotalFactory();
//        var facBall = Totalfac.getFactory("ball");
//        var facPhone = Totalfac.getFactory("phone");
//        var ball_1 = facBall.getBall("footBall");
//        var ball_2 = facBall.getBall("basketball");
//        var phone_1 = facPhone.getPhone("apple");
//        var phone_2 = facPhone.getPhone("huawei");
//        ball_1.show();
//        ball_2.show();
//        phone_1.show();
//        phone_2.show();
//    }
//}
//interface ball{
//    void show();
//    int price();
//}
//interface phone{
//    void show();
//}
//class iPhone implements phone{
//
//    @Override
//    public void show() {
//        System.out.println("I am A iPhone.");
//    }
//}
//class HuaWei implements phone{
//
//    @Override
//    public void show() {
//        System.out.println("I am A HuaWei P30-Pro.");
//    }
//}
//class basketball implements ball{
//
//    @Override
//    public void show() {
//        System.out.println("I am A basketball");
//    }
//
//    @Override
//    public int price() {
//        return 30;
//    }
//}
//class football implements ball{
//
//    @Override
//    public void show() {
//        System.out.println("I am A football");
//    }
//
//    @Override
//    public int price() {
//        return 40;
//    }
//}
//abstract class factory{
//    abstract ball getBall(String choose);
//    abstract phone getPhone(String name);
//}
//class FactoryOfPhone extends factory{
//
//    @Override
//    ball getBall(String choose) {
//        return null;
//    }
//
//    @Override
//    phone getPhone(String name) {
//        if(name.equalsIgnoreCase("apple")){
//            return new iPhone();
//        }
//        else if(name.equalsIgnoreCase("huawei")){
//            return new HuaWei();
//        }
//        else{
//            return null;
//        }
//    }
//}
//class FactoryOfBall extends factory{
//
//    @Override
//    ball getBall(String choose) {
//        if(choose.equalsIgnoreCase("basketball")){
//            return new basketball();
//        }
//        else if(choose.equalsIgnoreCase("football")){
//            return new football();
//        }
//        else{
//            return null;
//        }
//    }
//
//    @Override
//    phone getPhone(String name) {
//        return null;
//    }
//}
//class TotalFactory{
//    public factory getFactory(String choose){
//        if(choose.equalsIgnoreCase("phone")){
//            return new FactoryOfPhone();
//        }
//        else if(choose.equalsIgnoreCase("ball")){
//            return new FactoryOfBall();
//        }
//        else{
//            return null;
//        }
//    }
//}
