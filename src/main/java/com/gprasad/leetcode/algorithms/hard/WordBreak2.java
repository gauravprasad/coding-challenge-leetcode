package com.gprasad.leetcode.algorithms.hard;

import java.util.*;

/*
140. Word Break II
Hard

Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in any order.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

Example 1:
Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
Output: ["cats and dog","cat sand dog"]

Example 2:
Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
Explanation: Note that you are allowed to reuse a dictionary word.

Example 3:
Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: []


Constraints:

1 <= s.length <= 20
1 <= wordDict.length <= 1000
1 <= wordDict[i].length <= 10
s and wordDict[i] consist of only lowercase English letters.
All the strings of wordDict are unique.

 */
public class WordBreak2 {
    Map<String, List<String>>  wordList = new HashMap<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        return wordBreak(s, new HashSet<>(wordDict));
    }
    public List<String> wordBreak(String s, Set<String> wordDict) {
        if(wordList.containsKey(s)) return wordList.get(s);
        List<String> result = new ArrayList<>();
        if (wordDict.contains(s)) result.add(s);
        for (int end = 1; end <= s.length(); end++) {
            String firstCut = s.substring(0, end);
            if (wordDict.contains(firstCut)) {
                List<String> sublist = wordBreak(s.substring(end), wordDict);
                for (String remaining : sublist) result.add(firstCut + " " + remaining);
            }
        }
        wordList.put(s, result);
        return result;
    }

    //TODO : understand the bonus.
    class Solution {
        List<String> res = new ArrayList<>();

        public List<String> wordBreak(String s, List<String> wordDict) {
            Set<String> set = new HashSet<>();

            for(String s1: wordDict) {
                set.add(s1);
            }
            backTracking(new StringBuilder(), s, 0, set);

            return res;
        }


        private void backTracking(StringBuilder builder, String s, int index, Set<String> set) {

            if(index >= s.length()) {
                res.add(builder.toString());
                return;
            }

            for(int i= index; i<s.length(); i++) {
                String temp = s.substring(index, i+1);
                if(set.contains(temp)) {

                    if(builder.length() > 0) {
                        builder.append(" ");

                    }
                    builder.append(temp);



                    backTracking(builder, s, i+1, set);
                    //delete the last added
                    builder.delete(builder.length() - temp.length(), builder.length());
                    if (builder.length() > 0){
                        builder.delete(builder.length() - 1, builder.length());
                    }
                }
            }
        }
    }

}
