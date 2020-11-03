package com.Alogrithm;

import java.util.LinkedList;
import java.util.List;

public class leeterMap {
    public static String letterMap[] = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"

    };
    public static List<String> LetterCombinations(String digits){
        LinkedList<String> resList = new LinkedList<>();
        if(! "".equals(digits)){
            backtrace(0,digits,new StringBuilder(),resList);
        }
        return resList;
    }
    public static void backtrace(int i,String digits,StringBuilder sb,LinkedList<String> resList){
        if(sb.length() == digits.length()){
            resList.addLast(sb.toString());
            sb = new StringBuilder();
            return;
        }
        char digit = digits.charAt(i);
        String letters = letterMap[digit - '0'];
        for(int j = 0;j<letters.length();j++){
            sb.append(letters.charAt(j));
            backtrace(i+1,digits,sb,resList);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        var item = LetterCombinations("23");
        System.out.println(item);
    }
}
