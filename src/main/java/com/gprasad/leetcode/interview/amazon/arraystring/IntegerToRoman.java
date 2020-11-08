package com.gprasad.leetcode.interview.amazon.arraystring;

public class IntegerToRoman {
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    String[] thousands  = {"","M","MM","MMM"};
    String[] hundereds  = {"","C", "CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    String[] tens  = {"", "X","XX","XXX","XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] ones  = {"", "I","II","III","IV", "V", "VI","VII","VIII","IX"};

    /*public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<values.length && num>=0;i++){
            while (values[i]<=num){
                num-=values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }*/

    public String intToRoman(int num) {
        return thousands[num/1000]+hundereds[(num%1000)/100]+tens[(num%100)/10]+ones[num%10];
    }
}
