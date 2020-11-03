package com.Alogrithm;

import java.util.Stack;

public class Solution1 {
    //得到栈底的元素
    public static int getAndRemoveLastElement(Stack<Integer> stack){
        int result = stack.pop();
        if(stack.isEmpty()){
            return result;
        }
        else{
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        var ans = getAndRemoveLastElement(stack1);
        var ans2 = getAndRemoveLastElement(stack1);
        System.out.println(ans);
        System.out.println(ans2);

    }
}
