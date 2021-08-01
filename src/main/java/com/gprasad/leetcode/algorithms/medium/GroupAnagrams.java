package com.gprasad.leetcode.algorithms.medium;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> stringListMap = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            stringListMap.putIfAbsent(sorted, new ArrayList<>());
            List<String> fetched = stringListMap.get(sorted);
            fetched.add(s);
        }
        return stringListMap.values().stream().collect(Collectors.toList());
    }
}
