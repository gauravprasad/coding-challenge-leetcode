package com.gprasad.leetcode.interview.apple.others;

public class ReverseInteger {
    public int reverse(int x) {
        int sign = x<0?-1:1;
        x = x*sign;
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        try{
            return sign*Integer.valueOf(sb.reverse().toString());
        }catch (NumberFormatException nbf){
            return 0;
        }
    }
    public int reverse2(int x) {
        int sign = x<0?-1:1;
        x = x*sign;
        Long result = 0l;
        while(x>=10){
            result = (result*10)+(x%10);
            x = x/10;
        }
        result = (result*10)+x;
        return sign * ((Long.valueOf(Integer.MIN_VALUE)>result || result>Long.valueOf(Integer.MAX_VALUE))?0: result.intValue());
    }
}
