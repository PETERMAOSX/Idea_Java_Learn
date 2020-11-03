package com.LinkPro;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SET_TEST {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> intest = new HashSet<>();
        for(int i=0;i<10000;i++){
            intest.add(random.nextInt(30));
        }
        System.out.println(intest);

    }
}
