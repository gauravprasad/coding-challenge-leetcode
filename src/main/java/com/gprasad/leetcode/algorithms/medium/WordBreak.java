package com.gprasad.leetcode.algorithms.medium;

import java.util.*;

/*
139. Word Break
Medium

Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

Example 1:

Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".

Example 2:
Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.

Example 3:
Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false


Constraints:

1 <= s.length <= 300
1 <= wordDict.length <= 1000
1 <= wordDict[i].length <= 20
s and wordDict[i] consist of only lowercase English letters.
All the strings of wordDict are unique.
 */
public class WordBreak {
    private Map<String, Boolean> wordAvailability = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.contains(s)) return true;
        if(wordAvailability.containsKey(s)) return wordAvailability.get(s);
        for(int end = 1;end<=s.length();end++){
            if(wordDict.contains(s.substring(0,end)) && wordBreak(s.substring(end),wordDict)){
                wordAvailability.put(s, true);
                return true;
            }
        }
        wordAvailability.put(s, false);
        return false;
    }
}
