package com.gprasad.leetcode.interview.apple.arraystring;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grpAnagram = new HashMap<>();
        for(String str:strs){
            char[] keyArr = str.toCharArray();
            Arrays.sort(keyArr);
            String key = String.valueOf(keyArr);
            grpAnagram.putIfAbsent(key, new ArrayList<>());
            grpAnagram.get(key).add(str);
        }
        return grpAnagram.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
    }
}
