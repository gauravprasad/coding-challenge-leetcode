package com.gprasad.leetcode.interview.apple.dynamicprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {
    Map<String, Boolean> dpSol = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.contains(s)) return true;
        if(dpSol.containsKey(s)) return dpSol.get(s);
        for(int idx=1;idx<s.length();idx++){
            if(wordDict.contains(s.substring(0,idx)) && wordBreak(s.substring(idx), wordDict)){
                dpSol.put(s, true);
                return true;
            }
        }
        dpSol.put(s,false);
        return false;
    }
}
