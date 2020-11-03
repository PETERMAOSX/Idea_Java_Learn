package com.SuanFaStu;

import java.util.Arrays;

public class Array_plus {
    static int[] plusOne(int[] nums){
        for (int i=nums.length-1;i>=0;i--){
            nums[i] ++;
            nums[i] = nums[i] % 10;
            if(nums[i] != 0) return nums;
        }
        nums = new int[nums.length+1];
        nums[0] = 1;
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,9,9,9};
        int[] ans = plusOne(nums);
        System.out.println(Arrays.toString(ans));
    }
}
