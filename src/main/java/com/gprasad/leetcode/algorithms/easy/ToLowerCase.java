package com.gprasad.leetcode.algorithms.easy;

import java.util.stream.Collector;

public class ToLowerCase {

    /*public String toLowerCase(String str) {
        if (str == null || str.trim().length() == 0) return str;
        return str.chars().mapToObj(c->c>='A' && c<='Z'?(c+('a'-'A')):c).collect(Collector.of(StringBuilder::new,StringBuilder::append,StringBuilder::append,StringBuilder::toString));
    }*/
    public String toLowerCase(String str) {
        if (str == null || str.trim().length() == 0) return str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            c = c >= 'A' && c <= 'Z' ? (char) (c + ('a' - 'A')) : c;
            sb.append(c);
        }
        return sb.toString();
    }
}
