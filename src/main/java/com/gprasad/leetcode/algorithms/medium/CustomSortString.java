package com.gprasad.leetcode.algorithms.medium;

public class CustomSortString {
    public String customSortString(String order, String str) {
        int[] strCharCount = new int[26];
        for(int idx = 0; idx<str.length(); idx++){
            ++strCharCount[str.charAt(idx)-'a'];
        }
        StringBuilder sb = new StringBuilder();
        for(int idx =0; idx<order.length(); idx++){
            while(strCharCount[order.charAt(idx)-'a']-- > 0) sb.append(order.charAt(idx));
        }

        for(char c = 'a'; c<='z'; c++){
            while(strCharCount[c-'a']-- > 0) sb.append(c);
        }

        return sb.toString();
    }
}
