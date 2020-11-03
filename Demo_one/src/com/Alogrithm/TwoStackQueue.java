package com.Alogrithm;

import java.util.Stack;

public class TwoStackQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;
    public TwoStackQueue(){
        this.stackPop = new Stack<>();
        this.stackPush = new Stack<>();
    }
    private void PushToPop(){
        if(this.stackPop.empty()){
            while(!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
    }
    public void add(int value){
        this.stackPush.push(value);
        this.PushToPop();
    }
    public int poll(){
        if(stackPop.isEmpty() && stackPush.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        PushToPop();
        return stackPop.pop();
    }
    public int peek(){
        if(stackPop.isEmpty() && stackPush.isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        PushToPop();
        return stackPop.peek();
    }

    public static void main(String[] args) {
        TwoStackQueue stack = new TwoStackQueue();
        stack.add(9);
        stack.add(8);
        stack.add(7);
        stack.add(6);
        stack.add(5);
        System.out.println(stack.stackPush.peek());


    }
}
class TwoStackQueue_pro{
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;
    public TwoStackQueue_pro(){
        this.stackPush = new Stack<>();
        this.stackPop = new Stack<>();
    }
    private void push2pop(){
        if(this.stackPop.isEmpty()){
            while(!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
    }
    public void add(int value){
        this.stackPush.push(value);
        push2pop();
    }
    public int peek(){
        if(this.stackPop.isEmpty() && this.stackPush.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        push2pop();
        return stackPush.peek();
    }
    public int poll(){
        if(this.stackPop.isEmpty() && this.stackPush.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        push2pop();
        return stackPush.pop();
    }
}
