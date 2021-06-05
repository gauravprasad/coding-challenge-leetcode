package com.gprasad.leetcode.algorithms.medium;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        if(s2==null || s1==null|| s1Len>s2Len) return false;

        int[] checkFreq = new int[26];
        for(int i=0;i<s1Len;i++){
            checkFreq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2Len;i++){
            checkFreq[s2.charAt(i)-'a']--;
            if(i>=s1Len) checkFreq[s2.charAt(i-s1Len)-'a']++;
            if(checkAll(checkFreq)) return true;
        }
        return false;
    }

    private boolean checkAll(int[] arr) {
        for (int n : arr) {
            if (n != 0) return false;
        }
        return true;
    }
}
