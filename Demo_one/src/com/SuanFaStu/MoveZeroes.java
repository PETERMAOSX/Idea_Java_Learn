package com.SuanFaStu;

import java.util.Arrays;

public class MoveZeroes {
    static void move(int[] nums){
        int lastNumberAt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[lastNumberAt++] = nums[i];
            }
        }
        for(int j=lastNumberAt;j<nums.length;j++){
            nums[j] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,1,0,3,4,2,0};
        move(nums);
        System.out.println(Arrays.toString(nums));
    }
}
