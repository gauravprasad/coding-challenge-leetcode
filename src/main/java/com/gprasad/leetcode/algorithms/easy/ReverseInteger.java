/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.leetcode.algorithms.easy;

/**
 *
 * @author gq6pras
 */
public class ReverseInteger {

    long reverse = 0;

    public int reverse(int x) {

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

}
