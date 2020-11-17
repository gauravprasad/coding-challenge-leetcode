package com.gprasad.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0) return "";
        if (numRows == 1) return s;
        List<StringBuilder> sbs = new ArrayList<>();
        int row = 0;
        boolean rowFlag = false;
        for (int i = 0; i < s.length(); i++) {
            if (row == sbs.size()) {
                sbs.add(new StringBuilder());
            }
            sbs.get(row).append(s.charAt(i));
            rowFlag = (row == 0 || (row + 1) % numRows == 0) ? !rowFlag : rowFlag;
            row = rowFlag ? row + 1 : row - 1;
        }
        return sbs.stream().map(sb -> sb.toString()).collect(Collectors.joining(""));
    }
}
