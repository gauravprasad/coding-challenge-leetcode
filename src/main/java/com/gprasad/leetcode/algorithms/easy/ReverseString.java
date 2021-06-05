/*
 Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh". 
 */
package com.gprasad.leetcode.algorithms.easy;

/**
 *
 * @author gq6pras
 */
public class ReverseString {
    public String reverseString(String s) {
       StringBuilder sb = new StringBuilder();
       for(int i=s.length()-1;i>=0;i--)
       {
           sb.append(s.charAt(i));
       }
        System.out.println(sb);
       return sb.toString();
    }
}
