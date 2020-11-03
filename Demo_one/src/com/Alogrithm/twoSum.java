package com.Alogrithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int[] twoSum(int [] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] == target - nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("Error");
    }
    public static int[] twoSum_(int [] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);   //2 -> 0 , 7 -> 1 , 11 -> 2 , 15 -> 3
        }
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                System.out.println(map.get(complement));
                return new int[] {i,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("Error");
    }
    public static int[] twoSum__(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("Error");
    }
    public static void main(String[] args) {
        var myList = new int[] {2,7,11,15};
        var ans = twoSum(myList,9);
        var ans_ = twoSum_(myList,9);
        var ans__ = twoSum__(myList,9);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans_));
        System.out.println(Arrays.toString(ans__));
    }
}
