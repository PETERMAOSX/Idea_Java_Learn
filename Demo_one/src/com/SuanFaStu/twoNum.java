package com.SuanFaStu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoNum {
    static int[] twosum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
         for(int j=i+1;j<nums.length;j++){
             if(nums[i] + nums[j] == target){
                 return new int[]{i,j};
             }
         }
        }
        return null;
    }
//    static int[] twosum_01(int[] nums,int target){
//        int i = 0;
//        int j = 1;
//
//    }
    static int[] twosum_pro(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        var ans = twosum_pro(nums,6);
        System.out.println(Arrays.toString(ans));
    }
}
