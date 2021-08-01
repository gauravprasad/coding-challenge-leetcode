package com.gprasad.leetcode.algorithms.hard;

import java.util.regex.Pattern;

/*
65. Valid Number
Hard

A valid number can be split up into these components (in order):

A decimal number or an integer.
(Optional) An 'e' or 'E', followed by an integer.
A decimal number can be split up into these components (in order):

(Optional) A sign character (either '+' or '-').
One of the following formats:
One or more digits, followed by a dot '.'.
One or more digits, followed by a dot '.', followed by one or more digits.
A dot '.', followed by one or more digits.
An integer can be split up into these components (in order):

(Optional) A sign character (either '+' or '-').
One or more digits.
For example, all the following are valid numbers: ["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"], while the following are not valid numbers: ["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"].

Given a string s, return true if s is a valid number.



Example 1:

Input: s = "0"
Output: true
Example 2:

Input: s = "e"
Output: false
Example 3:

Input: s = "."
Output: false
Example 4:

Input: s = ".1"
Output: true


Constraints:

1 <= s.length <= 20
s consists of only English letters (both uppercase and lowercase), digits (0-9), plus '+', minus '-', or dot '.'.

 */
public class ValidNumber {
   /* public boolean isNumber(String s) {
        boolean isValidNumber = s.charAt(s.length() - 1) == 'e' || s.charAt(s.length() - 1) == 'E';
        s = isValidNumber ? s.substring(0, s.length() - 1) : s;
        isValidNumber = Pattern.matches("^[+-]?([0-9]+\\.?[0-9]*|\\.[0-9]+)$", s);
        if (!isValidNumber) {
            isValidNumber = Pattern.matches("^[+-]?([0-9]+)$", s);
        }
        return isValidNumber;
    }*/

    public boolean isNumber(String s) {
        boolean digitFound = false;
        boolean expoFound = false;
        boolean dotFound = false;
        for (int idx = 0; idx < s.length(); idx++) {
            char c = s.charAt(idx);
            if (Character.isDigit(c)) digitFound = true;
            else if (c == '+' || c == '-') {
                if (idx > 0 && s.charAt(idx - 1) != 'e' && s.charAt(idx - 1) != 'E') return false;
            } else if (c == 'e' || c == 'E') {
                if (expoFound || !digitFound) return false;
                expoFound = true;
                digitFound = false;
            } else if (c == '.') {
                if (dotFound || expoFound) return false;
                dotFound = true;
            } else return false;

        }
        return digitFound;
    }
}

