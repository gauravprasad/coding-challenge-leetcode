package com.gprasad.leetcode.interview.google.arraysstrings;

import java.math.BigInteger;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int prod = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int tmp = prod+result[i + j + 1];
                result[i + j + 1] = tmp%10;
                result[i+j] = result[i+j]+(tmp/10);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int val : result){
            if(sb.length()!=0 || val!=0){
                sb.append(val);
            }
        }
        return sb.length()!=0? sb.toString() : "0";
        //return new BigInteger(num1).multiply(new BigInteger(num2)).toString();
    }
}

//"123"
//"456"
