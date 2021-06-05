package com.gprasad.leetcode.interview.apple.others;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int result = 0;
        for(char c : jewels.toCharArray()){
            set.add(c);
        }
        for(char c: stones.toCharArray()){
            result = set.contains(c)?result+1:result+0;
        }
        return result;
    }
}
