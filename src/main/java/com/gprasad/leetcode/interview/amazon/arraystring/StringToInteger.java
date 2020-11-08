package com.gprasad.leetcode.interview.amazon.arraystring;

public class StringToInteger {

    public int myAtoi(String s) {
        int result = 0;
        int sign = 1;
        int i = 0;
        if(s==null || s.isEmpty()) return 0;
        while (i<s.length() && s.charAt(i)==' ') i++;
        if(i<s.length()&&(s.charAt(i)=='+' || s.charAt(i)=='-')) sign=s.charAt(i++)=='-'?-1:sign;
        while (i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>Integer.MAX_VALUE%10))return sign>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
            result=(result*10)+(s.charAt(i++)-'0');
        }
        return result*sign;
    }
}
