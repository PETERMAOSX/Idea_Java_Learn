package com.Alogrithm;

public class Huiwen {
    public static boolean isHuiwen(int x){
        String reversedStr = (new StringBuilder(x+" ")).reverse().toString();
        return (x+" ").equals(reversedStr);
    }
    public static boolean isHuiwen_(int s){
        if(s < 0){
            return false;
        }
        int cur = 0;
        int num = s;
        while(num != 0){
            cur = cur*10+num%10;
            num = num / 10;
        }
        return s == cur;
    }

    public static void main(String[] args) {
        int x = 12321;
        var ans = isHuiwen_(x);
        System.out.println(ans);
    }
}
