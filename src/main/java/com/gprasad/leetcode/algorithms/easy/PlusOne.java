package com.gprasad.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    /*public int[] plusOne(int[] digits) {
        int r = 0;
        digits[digits.length - 1] = ++digits[digits.length - 1];
        List<Integer> list = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            list.add(0, (digits[i] +r) % 10);
            r = (digits[i] +r) / 10;
        }
        if (r > 0) list.add(0, r);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }*/
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9)
                digits[i] = 0;
            else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
