package com.Alogrithm;

public class MaxCap {
    public static int maxcap(int[] nums){
        int ans = 0,i = 0,j = nums.length-1;
        while(i < j){
            ans = Math.max(ans,Math.min(nums[i],nums[j]) * (j-i));
            if(nums[i] < nums[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
    public static int maxArea(int[] height){
        int maxarea = 0;
        for(int i = 0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                maxarea = Math.max(maxarea,Math.min(height[i],height[j])*(j-i));
            }
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int [] height = new int[] {1,8,6,2,5,4,8,3,7};
        var ans = maxcap(height);
        var ans_ = maxArea(height);
        System.out.println(ans);
        System.out.println(ans_);
    }
}
