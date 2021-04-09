package com.gprasad.leetcode.interview.apple.arraystring;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Executor {
    public static void main(String[] args) {
        /*String[] strs0 = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(strs0));*/

        /*int[][] x = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(new SpiralMatrix().spiralOrder(x));*/

        //System.out.println(new ValidPalindrome().isPalindrome("race a car"));
        //System.out.println(new ValidParentheses().isValid("]"));
        //System.out.println(new FirstUniqueCharacterInAString().firstUniqChar(""));
        //int[][] result = new SparseMatrixMultiplication().multiply(new int[][]{{1,-5}}, new int[][]{{12},{-1}});
        //System.out.println(Arrays.stream(result).map(arr->Arrays.stream(arr).boxed().collect(Collectors.toList())).collect(Collectors.toList()));
        //System.out.println(new TrappingRainWater().trap(new int[]{3,0,1,2,5}));
        //System.out.println(new SubarraySumEqualsK().subarraySum(new int[]{1,1,1}, 2));
        //System.out.println(new MissingNumber().missingNumber(new int[]{0,1}));
        //System.out.println(Arrays.stream(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{-1,1,0,-3,3})).boxed().collect(Collectors.toList()));
        System.out.println(new MinimumWindowSubstring().minWindow("ADOBECODEBANC","ABC"));//"BANC"
    }
}
