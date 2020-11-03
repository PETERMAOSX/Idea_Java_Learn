package com.Alogrithm;

import java.util.Stack;

public class MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    public MyStack1(){
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }
    public void push(int newNum){
        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }
        else if(newNum <= this.getMin()){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }
    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("your stack is empty");
        }
        int value = this.stackData.pop();
        if(value == this.getMin()){
            //把最小的值也去掉，留下第二大的值
            this.stackMin.pop();
        }
        return value;
    }
    public int getMin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }
        return this.stackMin.peek();
    }

    public static void main(String[] args) {
        MyStack1 stack1 = new MyStack1();
        stack1.push(88);
        stack1.push(2);
        stack1.push(3);
        stack1.push(99);
        System.out.println(stack1.getMin());
        System.out.println(stack1.pop());
    }
}
class MyStack1_pro{
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    public MyStack1_pro(){
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }
    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        int value = this.stackData.pop();
        if(value == this.getMin()){
            this.stackMin.pop();
        }
        return value;
    }
    public int getMin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return this.stackMin.peek();
    }
    public void push(int value){
        this.stackData.push(value);
        if(this.stackMin.isEmpty()){
            this.stackMin.push(value);
        }
        else if(value <= this.getMin()){
            this.stackMin.push(value);
        }
    }
}

