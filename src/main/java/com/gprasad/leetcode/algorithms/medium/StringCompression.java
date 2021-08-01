package com.gprasad.leetcode.algorithms.medium;

import java.util.Map;

public class StringCompression {
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) return 0;
        int init = 0;
        int counter = 0;
        String result="";
        while (init<chars.length) {
            if (counter<chars.length && chars[init] == chars[counter]) {
                counter++;
            }else{
                result = result+chars[init];
                if(counter-init>1)result=result+(counter-init);
                init = counter;
            }
        }
        System.out.println(result);
        chars = result.length() < chars.length?result.toCharArray():chars;
        return chars.length;
    }
}
