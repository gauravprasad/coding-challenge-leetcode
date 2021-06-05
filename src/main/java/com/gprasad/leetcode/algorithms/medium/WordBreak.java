package com.gprasad.leetcode.algorithms.medium;

import java.util.*;

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
