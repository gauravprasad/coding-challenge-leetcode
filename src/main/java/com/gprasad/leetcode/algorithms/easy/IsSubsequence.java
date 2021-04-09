package com.gprasad.leetcode.algorithms.easy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        for(int i=0;i<s.length();i++){
            int index  = t.indexOf(s.charAt(i));
            if(index!=-1) t = t.substring(index+1);
            else return false;
        }
        return true;
    }
}
