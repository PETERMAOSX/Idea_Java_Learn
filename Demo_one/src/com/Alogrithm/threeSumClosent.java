package com.Alogrithm;

import java.util.Arrays;

public class threeSumClosent {
    public static int threeSum(int[] nums,int target){
        Arrays.sort(nums);  //首先将数组进行排序
        int ans = nums[0] + nums[1] + nums[3];  //ans的初始值是 nums[0+1+2] 前三项的和
        for(int i=0;i<nums.length;i++){  //便利数组中的每一个
            int start = i+1;  //开始的指针
            int end = nums.length-1;  //尾指针
            while(start < end){  //当 头指针和尾指针不重合的时候
                int sum = nums[start] + nums[end] + nums[i];  //sum = 各个指针指向的值加上本体值
                if(Math.abs(target-sum) < Math.abs(target-ans)){ //如果目标减和 小于 目标值减ans初始值
                    ans = sum;  //ans值更新
                }
                if(sum > target){   //如果sum 比 目标值还大
                    end--;  //尾指针前移
                }
                else if(sum < target){  //如果sum 比 目标值小
                    start++;  //前指针后移
                }
                else{
                    return ans; //如果相等就返回ans值
                }
            }
        }
        return ans;
    }

    public static int solution(int[] nums,int target){
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++){
            int start = i+1;
            int end = nums.length-1;
            while(start < end){
                int sum = nums[start]+nums[end]+nums[i];
                if(Math.abs(target - sum) < Math.abs(target - ans)){
                    ans = sum;
                }
                if(target < sum){
                    start++;
                }
                else if(target > sum){
                    end--;
                }
                else
                    return ans;
            }
        }
        return ans;
    }

    public static int solutionPro(int[] nums,int target){
        Arrays.sort(nums);
        int ans = 0;
        for(int i= 0 ;i<=2;i++){
            ans += nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int start = i+1;
            int end = nums.length-1;
            while(start < end){
                int sum = nums[start]+nums[end]+nums[i];
                if(Math.abs(target - sum) < Math.abs(target - ans)){
                    ans = sum;
                }
                if(target < sum){
                    end--;
                }
                else if(target > sum){
                    start++;
                }
                else
                    return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,-4,5,4,3,2,6,5};
        var ans = solutionPro(nums,17);
        System.out.println(ans);
    }
}
