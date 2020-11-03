package com.SuanFaStu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UnionArray {
    static int[] intersect(int[] nums1,int[] nums2){
        if(nums1.length >nums2.length){
            return intersect(nums2, nums1);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums1){
            int count = map.getOrDefault(num,0) + 1;
            map.put(num,count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for(int num : nums2){
            int count = map.getOrDefault(num,0);
            if(count > 0){
                intersection[index] = num;
                index++;
                count--;
                if(count > 0){
                    map.put(num,count);
                }
                else{
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection,0,index);
        //return intersection;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,1,2,2,3,4,5};
        int[] nums2 = new int[] {2,3,4};
        int[] ans = intersect(nums1,nums2);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
}
