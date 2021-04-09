package com.gprasad.leetcode.interview.apple.arraystring;

public class IntegerToRoman {
    String[] thousands = {"", "M", "MM", "MMM"};
    String[] hundereds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String intToRoman(int num) {
        return thousands[num / 1000] + hundereds[(num % 1000) / 100] + tens[(num % 100) / 10] + ones[(num % 10)];
    }
//TODO: Revisit it seems better.
    public String intToRoman2(int num) {
        int[] integers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String retVal = "";

        for (int i = 0; i < integers.length; i++) {
            while (num >= integers[i] && num > 0) {

                retVal += symbols[i];
                num -= integers[i];
            }
        }
        return retVal;


    }
}
