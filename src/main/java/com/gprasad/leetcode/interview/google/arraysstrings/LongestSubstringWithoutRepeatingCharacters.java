package com.gprasad.leetcode.interview.google.arraysstrings;
/*Given a string s, find the length of the longest substring without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0


Constraints:

0 <= s.length <= 5 * 10^4
s consists of English letters, digits, symbols and spaces.*/

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int[] indexer = new int[256];
        int maxSubString = 0;
        int init = 0;
        int next = 0;
        while (next < s.length()) {
           init = Math.max(indexer[s.charAt(next)],init);
           maxSubString = Math.max(maxSubString, next-init+1);
           indexer[s.charAt(next)]=++next;
        }
        return maxSubString;
    }
}
