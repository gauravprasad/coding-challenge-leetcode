package com.gprasad.leetcode.interview.google.arraysstrings;

import java.util.HashMap;
import java.util.Map;

/*Given two strings s and t of lengths m and n respectively, return the minimum window in s which will contain all the characters in t. If there is no such window in s that covers all characters in t, return the empty string "".

Note that If there is such a window, it is guaranteed that there will always be only one unique minimum window in s.



Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Example 2:

Input: s = "a", t = "a"
Output: "a"


Constraints:

m == s.length
n == t.length
1 <= m, n <= 105
s and t consist of English letters.


Follow up: Could you find an algorithm that runs in O(m + n) time?*/
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";
        Map<Character, Integer> dictT = new HashMap<>();
        for (int idx = 0; idx < t.length(); idx++) {
            int count = dictT.getOrDefault(t.charAt(idx), 0);
            dictT.put(t.charAt(idx), count + 1);
        }
        return null;
    }
}
