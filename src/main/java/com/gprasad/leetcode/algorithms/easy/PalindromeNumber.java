package com.gprasad.leetcode.algorithms.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        Integer reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + (x % 10);
            x /= 10;
        }
        return x == reverse || x  == reverse/10;
    }
}
