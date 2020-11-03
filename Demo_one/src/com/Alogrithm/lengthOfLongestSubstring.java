package com.Alogrithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lengthOfLongestSubstring {
    public static int LengthOfLongestSubstring(String s){
        int n = s.length();
        int ans = 0;
        Map<Character,Integer> mp = new HashMap<>();
        for(int start = 0,end = 0;end<n;end++){
            char ch = s.charAt(end);
            if(mp.containsKey(ch)){
                start = Math.max(mp.get(ch),start);
            }
            ans = Math.max(ans,end-start);
            mp.put(s.charAt(end),end);
        }
        return ans;
    }
    public static int LengthOfLength(String s){
        int n = s.length();
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(isRight(s,i,j)) ans = Math.max(ans,j-i);
            }
        }
        return ans;
    }
    public static boolean isRight(String s,int start,int end){
        Set<Character> set = new HashSet<>();
        for(int i=start;i<end;i++){
            Character ch = s.charAt(i);
            if(set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int ans = LengthOfLongestSubstring(s);
        var ans_ = LengthOfLength(s);
        System.out.println(ans);
    }
}
