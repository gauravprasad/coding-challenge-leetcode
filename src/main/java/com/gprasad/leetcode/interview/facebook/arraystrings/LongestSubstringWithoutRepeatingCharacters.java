package com.gprasad.leetcode.interview.facebook.arraystrings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int initializer = 0;
        int next = 0;
        Map<Character, Integer> ifThere = new HashMap<>();
        while (next < s.length()) {
            if (ifThere.containsKey(s.charAt(next))) initializer = Math.max(ifThere.get(s.charAt(next)), initializer);
            result = Math.max(result, next - initializer+1);
            ifThere.put(s.charAt(next), next+1);
            next++;
        }
        return result;
    }
}
