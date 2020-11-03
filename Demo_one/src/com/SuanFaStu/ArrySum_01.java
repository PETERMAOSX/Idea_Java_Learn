package com.SuanFaStu;

import java.lang.reflect.Array;

public class ArrySum_01 {
    public static int removeDuplicates(int[] nums){
        if(nums.length == 0) return 0;
        int i = 0;
        for(int j = 1;j < nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums =new int[]{0,0,0,1,1,1,2,2,3,3,4,4,5,6};
        int len = removeDuplicates(nums);
        System.out.println(len);
        System.out.println("--------");
        for(int i=0;i<len;i++){
            System.out.println(nums[i]);
        }
        System.out.println("--------");
    }
}

