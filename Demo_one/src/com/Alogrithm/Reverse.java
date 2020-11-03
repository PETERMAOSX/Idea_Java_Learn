package com.Alogrithm;

import java.util.Scanner;

public class Reverse {
    public static int reverse(int number){
        int ans = 0;
        while(number != 0){
            ans = ans * 10 + number % 10;
            number = number / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = reverse(x);
        System.out.println(ans);

    }
}

