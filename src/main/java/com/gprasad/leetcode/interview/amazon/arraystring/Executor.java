package com.gprasad.leetcode.interview.amazon.arraystring;

public class Executor {
    public static void main(String[] args) {
        StringToInteger stringToInteger  = new StringToInteger();
        System.out.println(stringToInteger.myAtoi("-91283472332"));
        System.out.println(stringToInteger.myAtoi("42"));
        System.out.println(stringToInteger.myAtoi("   -42"));
        System.out.println(stringToInteger.myAtoi("4193 with words"));
        System.out.println(stringToInteger.myAtoi("words and 987"));
        System.out.println(stringToInteger.myAtoi(""));

        IntegerToRoman integerToRoman = new IntegerToRoman();
        System.out.println(integerToRoman.intToRoman(3));
        System.out.println(integerToRoman.intToRoman(4));
        System.out.println(integerToRoman.intToRoman(9));
        System.out.println(integerToRoman.intToRoman(58));
        System.out.println(integerToRoman.intToRoman(1994));

        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));
        System.out.println(romanToInteger.romanToInt("IV"));
        System.out.println(romanToInteger.romanToInt("IX"));
        System.out.println(romanToInteger.romanToInt("LVIII"));
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }
}
