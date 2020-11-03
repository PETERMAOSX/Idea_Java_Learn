package com.LinkPro;

import java.util.Random;

public class flowTest {
    public static void main(String[] args) {
        new Random(47).ints(5,20).distinct().limit(7).sorted().forEach(System.out::println);
    }
}
