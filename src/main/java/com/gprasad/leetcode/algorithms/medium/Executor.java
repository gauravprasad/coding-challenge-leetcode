package com.gprasad.leetcode.algorithms.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Executor {
    public static void main(String[] args) {
        /*ZigZagConversion conversion = new ZigZagConversion();
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

        RotateImage rotateImage = new RotateImage();
        int[][] t1 = {{1,2,3},{4,5,6},{7,8,9}};
        printMatrix(t1);
        System.out.println();
        rotateImage.rotate(t1);
        printMatrix(t1);
        System.out.println();
        int[][] t2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15, 14, 12, 16}};
        printMatrix(t2);
        System.out.println();
        rotateImage.rotate(t2);
        printMatrix(t2);*/

        //System.out.println(new PermutationInString().checkInclusion("ab", "eidbaooo"));
        //System.out.println(new KDiffPairsInAnArray().findPairs(new int[]{3,1,4,1,5}, 2));
        //ListNode head = new RemoveNthNodeFromEndOfList().removeNthFromEnd(getNode(),1);

        //System.out.println(new LongestSubstringWithAtMostKDistinctCharacters().lengthOfLongestSubstringKDistinct("abaccc",2));
        //System.out.println(new PalindromicSubstrings().countSubstrings("abc"));
        //System.out.println(new PalindromicSubstrings().countSubstrings("aaa"));

        /*System.out.println(new StringCompression().compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b'}));
        System.out.println(new StringCompression().compress(new char[]{'a'}));
        System.out.println(new StringCompression().compress(new char[]{'a','b','c','c'}));
        System.out.println(new StringCompression().compress(new char[]{'a','a','b','b','c','c','c'}));*/

        //System.out.println(new DivideTwoIntegers().divide(-2147483648, -1));
       /* int[] x = {4,2,3,1};
        int[] result  = new BuildingsWithAnOceanView().findBuildings(x);
        System.out.println(Arrays.stream(result).boxed().collect(Collectors.toList()));*/


    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("| %d ", matrix[i][j]);
            }
            System.out.println("|");
        }
    }

    private static ListNode getNode(){
        return new ListNode(1, new ListNode(2,new ListNode(3,new ListNode(4))));
        //return new ListNode(1);
    }


}