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
        if (s == null || s.length() == 0 || t == null || t.length() == 0) return "";
        Map<Character, Integer> charCountT = new HashMap<>() {{
            for (int i = 0; i < t.length(); i++) put(t.charAt(i), getOrDefault(t.charAt(i), 0) + 1);
        }};
        boolean found = false;
        int minSubstring = s.length(), left = 0, right = s.length();
        int i = 0, j = 0, count = charCountT.size();
        while (j < s.length()) {
            char end = s.charAt(j++);
            if (charCountT.containsKey(end)) {
                charCountT.put(end, charCountT.get(end) - 1);
                if (charCountT.get(end) == 0) count--;
            }
            if (count > 0) continue;
            while (count == 0) {
                char start = s.charAt(i++);
                if (charCountT.containsKey(start)) {
                    charCountT.put(start, charCountT.get(start) + 1);
                    if (charCountT.get(start) > 0) count++;
                }
            }
            if (j - i < minSubstring) {
                minSubstring = j - i;
                left = i;
                right = j;
                found = true;
            }
        }
        return found ? s.substring(left - 1, right) : "";
    }
}
