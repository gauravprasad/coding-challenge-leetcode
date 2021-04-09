package com.gprasad.leetcode.interview.apple.sortingandsearching;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> wordFreq = new HashMap<>();

        for(String word:words){
            wordFreq.put(word,wordFreq.getOrDefault(word,0)+1);
        }
        return wordFreq
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry.comparingByKey()))
                .limit(k)
                .map(e->e.getKey())
                .collect(Collectors.toList());
    }
}
