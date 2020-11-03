package com.Alogrithm;

import java.util.LinkedList;
import java.util.Queue;

public class Dog_Cat_Queue {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog_1");
        Dog dog2 = new Dog("Dog_2");
        Dog dog3 = new Dog("Dog_3");
        Cat cat1 = new Cat("Cat_1");
        Cat cat2 = new Cat("Cat_2");
        Cat cat3 = new Cat("Cat_3");
        DogCatQueue queueOfAnimal = new DogCatQueue();
        queueOfAnimal.add(dog1);
        queueOfAnimal.add(dog3);
        queueOfAnimal.add(cat1);
        queueOfAnimal.add(cat3);
        queueOfAnimal.add(dog2);
        queueOfAnimal.add(cat2);
        System.out.println(queueOfAnimal.count);
        System.out.println(queueOfAnimal.pollAll().getName());
        System.out.println(queueOfAnimal.pollAll().getName());
        System.out.println(queueOfAnimal.pollAll().getName());
        System.out.println(queueOfAnimal.pollAll().getName());
        System.out.println(queueOfAnimal.pollAll().getName());
        System.out.println(queueOfAnimal.pollAll().getName());

    }
}
class Pet{
    private String type;
    private String name;
    public Pet(String type,String name){
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return this.type;
    }
    public String getName(){
        return this.name;
    }
}
class Dog extends Pet{
    public Dog(String name){
        super("Dog",name);
    }
}
class Cat extends Pet{
    public Cat(String name){
        super("Cat",name);
    }
}
class PetEnterQueue{
    public Pet pet;
    public long count;
    public PetEnterQueue(Pet pet,long count){
        this.pet = pet;
        this.count = count;
    }
    public Pet getPet(){
        return this.pet;
    }

    public long getCount() {
        return count;
    }
    public String getEnterPetType(){
        return this.pet.getType();
    }
}

class DogCatQueue{
    public Queue<PetEnterQueue> dogQ;
    public Queue<PetEnterQueue> catQ;
    public long count;
    public DogCatQueue(){
        this.dogQ = new LinkedList<>();
        this.catQ = new LinkedList<>();
        this.count = 0;
    }
    public void add(Pet pet){
        if(pet.getType().equalsIgnoreCase("dog")){
            this.dogQ.add(new PetEnterQueue(pet,this.count++));
        }
        else if(pet.getType().equalsIgnoreCase("cat")){
            this.catQ.add(new PetEnterQueue(pet,this.count++));
        }
        else{
            throw new RuntimeException("No dog or cat");
        }
    }
    public boolean isEmpty(){
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }
    public boolean isDogEmpty(){
        return this.dogQ.isEmpty();
    }
    public boolean isCatEmpty(){
        return this.catQ.isEmpty();
    }
    public Pet pollAll(){
        if(!this.dogQ.isEmpty() && !this.catQ.isEmpty()){
            if(this.dogQ.peek().getCount() < this.catQ.peek().getCount()){
                return this.dogQ.poll().getPet();
            }
            else{
                return this.catQ.poll().getPet();
            }
        }
        else if(!this.dogQ.isEmpty()){
            return this.dogQ.poll().getPet();
        }
        else if(!this.catQ.isEmpty()){
            return this.catQ.poll().getPet();
        }
        else{
            throw new RuntimeException("Queue is Empty");
        }
    }
    public Dog pollDog(){
        if(!this.isDogEmpty()){
            return (Dog) this.dogQ.poll().getPet();
        }
        else{
            throw new RuntimeException("Dog is empty");
        }
    }
    public Cat pollCat(){
        if(!this.isCatEmpty()){
            return (Cat) this.catQ.poll().getPet();
        }
        else{
            throw new RuntimeException("Cat is empty");
        }
    }
}