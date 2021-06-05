package com.gprasad.leetcode.interview.google.treegraph;

import java.util.*;
//TODO : Can be optimized more
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return 0;
        Map<String, Boolean> vMap = new HashMap<>() {{
            for (String str : wordList) put(str, false);
        }};
        Queue<String> q = new LinkedList<>();
        int length = 1;
        q.add(beginWord);
        vMap.put(beginWord,true);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                String word = q.poll();
                if(word.equals(endWord)) return length;
                wordMatch(word, q, vMap);
            }
            length++;
        }
        return 0;
    }

    private void wordMatch(String  word, Queue<String> q, Map<String, Boolean> vMap) {
        for(int idx=0;idx<word.length();idx++){
            char[] wordArr = word.toCharArray();
            for(char c = 'a';c<='z';c++){
                wordArr[idx] = c;
                String str = String.valueOf(wordArr);
                if(vMap.containsKey(str) && !vMap.get(str)){
                    q.add(str);
                    vMap.put(str,true);
                }
            }
        }
    }
}
