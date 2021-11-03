package com.gprasad.leetcode.algorithms.medium;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
  // NW : time complexity
  public List<List<String>> groupAnagrams(String[] strs) {
    if (strs == null || strs.length == 0) return new ArrayList<>();
    Map<String, List<String>> output = new HashMap<>();
    int[] charCount = new int[256];
    for (String s : strs) {
      Arrays.fill(charCount, 0);
      for (char c : s.toCharArray()) charCount[c]++;
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < 256; i++) {
        if(charCount[i]!=0) sb.append((char) i).append(charCount[i]);
      }
      output.putIfAbsent(sb.toString(), new ArrayList<>());
      output.get(sb.toString()).add(s);
    }
    return new ArrayList<>(output.values());
  }
  // NWlogW : time complexity
  public List<List<String>> groupAnagrams1(String[] strs) {
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
