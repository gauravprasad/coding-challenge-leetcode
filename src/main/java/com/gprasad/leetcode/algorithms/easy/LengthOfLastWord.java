package com.gprasad.leetcode.algorithms.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length()-s.lastIndexOf(" ")-1;
    }
    /*public int lengthOfLastWord(String s) {
        if(s==null || s.trim().length()==0) return 0;
        String[] words = s.split(" +");
        return words[words.length-1].length();
    }*/
}
