//package com.Design;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class t05_pro {
//    public static void main(String[] args) {
//        var KFC = new MealBuilder();
//        var meal1 = KFC.properVegMeal();
//        meal1.show();
//        System.out.println("Total cost: "+meal1.getCost());
//        System.out.println("+==============================+");
//        var meal2 = KFC.properNoVegMeal();
//        meal2.show();
//        System.out.println("Total cost: "+meal1.getCost());
//    }
//}
//interface Packing{
//    public String Pack();
//}
//interface Item{
//    public String name();
//    public float cost();
//    public Packing packing();
//}
//class Wrapper implements Packing{
//
//    @Override
//    public String Pack() {
//        return "Wrapper";
//    }
//}
//class Bottle implements Packing{
//
//    @Override
//    public String Pack() {
//        return "Bottle";
//    }
//}
//abstract class hamburger implements Item{
//    @Override
//    public Packing packing() {
//        return new Wrapper();
//    }
//
//    @Override
//    public abstract float cost();
//}
//abstract class Colo implements Item{
//    @Override
//    public Packing packing() {
//        return new Bottle();
//    }
//
//    @Override
//    public abstract float cost();
//
//}
//class vegHumber extends hamburger{
//
//    @Override
//    public String name() {
//        return "vegHumber";
//    }
//
//    @Override
//    public float cost() {
//        return 10;
//    }
//}
//class noVegHumber extends hamburger{
//
//    @Override
//    public String name() {
//        return "noVegHumber";
//    }
//
//
//    @Override
//    public float cost() {
//        return 6;
//    }
//}
//class pepsi extends Colo{
//
//    @Override
//    public String name() {
//        return "pepsi";
//    }
//
//
//    @Override
//    public float cost() {
//        return 4;
//    }
//}
//class coloa extends Colo{
//
//    @Override
//    public String name() {
//        return "coloa";
//    }
//
//
//    @Override
//    public float cost() {
//        return 5;
//    }
//}
//class Meal{
//    private List<Item> items = new ArrayList<>();
//    public void add(Item item){
//        this.items.add(item);
//    }
//    public float getCost(){
//        float cost = 0;
//        for(var i : items){
//            cost += i.cost();
//        }
//        return cost;
//    }
//    public void show(){
//        for(var i : items){
//            System.out.println("item: "+i.name());
//            System.out.println("pack: "+i.packing().Pack());
//            System.out.println("cost: "+i.cost());
//        }
//    }
//}
//class MealBuilder{
//    public Meal properVegMeal(){
//        var meal = new Meal();
//        meal.add(new vegHumber());
//        meal.add(new coloa());
//        return meal;
//    }
//    public Meal properNoVegMeal(){
//        var meal = new Meal();
//        meal.add(new noVegHumber());
//        meal.add(new pepsi());
//        return meal;
//    }
//}
