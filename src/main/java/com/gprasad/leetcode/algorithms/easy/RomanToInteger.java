package com.gprasad.leetcode.algorithms.easy;

import scala.Int;

public class RomanToInteger {
    public static void main(String[] args) throws Exception {
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) throws Exception {
        Integer value = 0;
        int i = s.length()-1;
        Integer prev = 0;
        while (i>=0){
            char c = s.charAt(i);
            Integer curr = convertor(c);
            value = curr<prev?value-curr:value+curr;
            prev=curr;
            i--;
        }
        return value;
    }

    private static Integer convertor(char c) throws Exception {

        Integer number = null;
        switch (c) {
            case 'I':
                number = 1;
                break;
            case 'V':
                number = 5;
                break;
            case 'X':
                number = 10;
                break;
            case 'L':
                number = 50;
                break;
            case 'C':
                number = 100;
                break;
            case 'D':
                number = 500;
                break;
            case 'M':
                number = 1000;
                break;
            default:
                throw new Exception("Invalid Format.");
        }
        return number;
    }

}
