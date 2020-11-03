//package com.Design;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class t05 {
//    public static void main(String[] args) {
//        var RestRoom = new MealBuilder();
//        var meal1 = RestRoom.properVegMeal();
//        meal1.show();
//        System.out.println("Total cost: "+meal1.getCost());
//        System.out.println("===========================");
//        var meal2 = RestRoom.properNoVegMeal();
//        meal2.show();
//        System.out.println("Total cost: "+meal2.getCost());
//    }
//}
//interface Packing{
//    public String pack();
//}
//interface item{
//    public String name();
//    public Packing packing();
//    public float cast();
//}
//class Wrapper implements Packing{
//
//    @Override
//    public String pack() {
//        return "Wrapper";
//    }
//}
//class Bottle implements Packing{
//
//    @Override
//    public String pack() {
//        return "Bottle";
//    }
//}
//abstract class Hamburger implements item{
//    @Override
//    public Packing packing() {
//        return new Wrapper();
//    }
//
//    @Override
//    public abstract float cast();
//}
//abstract class ColoDrink implements item{
//    @Override
//    public Packing packing() {
//        return new Bottle();
//    }
//
//    @Override
//    public abstract float cast();
//}
//class VegHurber extends Hamburger{
//
//    @Override
//    public String name() {
//        return "VegHurber";
//    }
//
//    @Override
//    public float cast() {
//        return 10;
//    }
//}
//class noVegHurber extends Hamburger{
//
//    @Override
//    public String name() {
//        return "noVegHurber";
//    }
//
//
//    @Override
//    public float cast() {
//        return 15;
//    }
//}
//class Pepsi extends ColoDrink{
//
//    @Override
//    public String name() {
//        return "Pepsi";
//    }
//
//    @Override
//    public float cast() {
//        return 3;
//    }
//}
//class Colo extends ColoDrink{
//
//    @Override
//    public String name() {
//        return "ColoColo";
//    }
//
//
//    @Override
//    public float cast() {
//        return 6;
//    }
//}
//class Meal{
//    private List<item> items = new ArrayList<>();
//    public void additem(item item){
//        this.items.add(item);
//    }
//    public float getCost(){
//        float cost = 0;
//        for(var i : items){
//            cost += i.cast();
//        }
//        return cost;
//    }
//    public void show(){
//        for(var i : items){
//            System.out.println("Item: "+i.name());
//            System.out.println("Packing: "+i.packing().pack());
//            System.out.println("Cost: "+i.cast());
//        }
//    }
//}
//class MealBuilder{
//    public Meal properVegMeal(){
//        Meal meal = new Meal();
//        meal.additem(new VegHurber());
//        meal.additem(new Colo());
//        return meal;
//    }
//    public Meal properNoVegMeal(){
//        var meal = new Meal();
//        meal.additem(new noVegHurber());
//        meal.additem(new Pepsi());
//        return meal;
//    }
//}
//
