package com.SuanFaStu;

import java.util.Arrays;
import java.util.HashMap;

public class count_alphbet {
    static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] table = new int[26];
        for(int i=0;i<s1.length();i++){
            table[s1.charAt(i) - 'a'] ++;
        }
        for(int i=0;i<s2.length();i++){
            table[s2.charAt(i) - 'a'] --;
            if(table[s2.charAt(i) -'a'] < 0){
                return false;
            }
        }
        return true;
    }
    static boolean isAnagra_01(String s1,String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        var s1_array = s1.toCharArray();
        var s2_array = s2.toCharArray();
        Arrays.sort(s1_array);
        Arrays.sort(s2_array);
        return Arrays.equals(s1_array,s2_array);
    }

    public static void main(String[] args) {
        System.out.println(isAnagra_01("ac","bb"));
        System.out.println(isAnagra_01("abc","cba"));
    }
}
