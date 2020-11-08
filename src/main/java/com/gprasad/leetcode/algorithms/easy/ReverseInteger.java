/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.leetcode.algorithms.easy;

/**
 * @author gq6pras
 */
public class ReverseInteger {

    static long reverse = 0;

    public static int reverse(int x) {

        if (x < 10 && x > -10) {
            reverse = reverse * 10 + x;
        } else {
            reverse = reverse * 10 + x % 10;
            reverse(x / 10);
        }
        if (reverse != (int) reverse) {
            reverse = 0;
        }
        if (reverse != (int) reverse) {
            reverse = 0l;
        }

        return (int) reverse;
    }

    public static int reverseW(int x) {
        long r = 0l;
        while (Math.abs(x) > 0) {
            r = r * 10l + Long.valueOf(x % 10);
            x /= 10;
        }
        return r==(int)r?(int)r:0;
    }

    public static void main(String[] args) {
        int input = 2147483647;
        System.out.println(reverse(input));
        System.out.println(reverseW(input));
    }
}
