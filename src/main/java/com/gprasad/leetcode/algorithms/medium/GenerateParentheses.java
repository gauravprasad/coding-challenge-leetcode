package com.gprasad.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;
//TODO: StringBuilder can be use to reduce the space complexity.
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateAll("(",1, 0, result, n);
        return result;
    }

    private void generateAll(String currentParentheses, int openCount, int closeCount, List<String> result, int n) {
        if(currentParentheses.length()==2*n){
            result.add(currentParentheses);
            return;
        }
        if(openCount<n) generateAll(currentParentheses.concat("("), openCount+1, closeCount, result, n);
        if(closeCount<openCount) generateAll(currentParentheses.concat(")"), openCount, closeCount+1, result, n);
    }
}
