package com.gprasad.leetcode.algorithms.medium;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" +");
        return IntStream.rangeClosed(1, arr.length).mapToObj(index -> arr[arr.length-index]).collect(Collectors.joining(" "));
    }
}
