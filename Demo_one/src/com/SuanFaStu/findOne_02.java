package com.SuanFaStu;

import java.util.HashMap;
import java.util.Map;

public class findOne_02 {
    static int singleNumber(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        //遍历数组的元素，将元素的个数放入一个哈希表中（元素，元素个数）

        for(Integer i : nums){
            Integer count = map.getOrDefault(i,0)+1;
            map.put(i,count);
        }
        for(Integer i : map.keySet()){
            Integer count = map.get(i);
            if(count == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,3,3,3,4};
        System.out.println(singleNumber(nums));
    }
}
