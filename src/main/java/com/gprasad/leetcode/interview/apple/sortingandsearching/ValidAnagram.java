package com.gprasad.leetcode.interview.apple.sortingandsearching;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return String.valueOf(sArr).equals(String.valueOf(tArr));
    }
    public boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] chars = new int[256];
        for(int i=0;i<s.length();i++){
            chars[s.charAt(i)]++;
            chars[t.charAt(i)]--;
        }
        for(int cnt : chars){
            if(cnt!=0) return false;
        }
        return true;
    }
}
