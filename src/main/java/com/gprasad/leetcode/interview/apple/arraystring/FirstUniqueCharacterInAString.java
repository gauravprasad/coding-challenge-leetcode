package com.gprasad.leetcode.interview.apple.arraystring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Set<Character> cSet = new HashSet<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            int idx = s.lastIndexOf(c);
            if(cSet.add(c) && idx==i) return i;
        }
        return -1;
    }
    public int firstUniqChar2(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(charCount.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
}
