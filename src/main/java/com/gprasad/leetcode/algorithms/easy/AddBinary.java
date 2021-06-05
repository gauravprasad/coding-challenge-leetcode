package com.gprasad.leetcode.algorithms.easy;
//TODO : Need to do it in the old school style
public class AddBinary {
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
    }
}
