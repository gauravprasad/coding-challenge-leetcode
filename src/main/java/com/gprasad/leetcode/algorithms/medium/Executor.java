package com.gprasad.leetcode.algorithms.medium;

import java.util.Arrays;

public class Executor {
    public static void main(String[] args) {
        ZigZagConversion conversion = new ZigZagConversion();
        System.out.println(conversion.convert("PAYPALISHIRING",3));
        System.out.println(conversion.convert("A",2));
        System.out.println(conversion.convert("ABC",1));

        WordBreak wb = new WordBreak();
        System.out.println(wb.wordBreak("leetcode", Arrays.asList("leet", "code")));
        System.out.println(wb.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        System.out.println(wb.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
        System.out.println(wb.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa")));

        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        System.out.println(reverseWordsInAString.reverseWords("the sky is blue"));
        System.out.println(reverseWordsInAString.reverseWords("  hello world  "));
        System.out.println(reverseWordsInAString.reverseWords("a good   example"));
        System.out.println(reverseWordsInAString.reverseWords("  Bob    Loves  Alice   "));
        System.out.println(reverseWordsInAString.reverseWords("Alice does not even like bob"));
    }
}