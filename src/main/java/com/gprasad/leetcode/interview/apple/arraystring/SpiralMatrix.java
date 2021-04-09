package com.gprasad.leetcode.interview.apple.arraystring;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;
        int row = matrix.length;
        int col = matrix[0].length;
        int topRow = 0;
        int botRow = row - 1;
        int leftCol = 0;
        int rightCol = col - 1;
        int direction = 0;
        while (topRow <= botRow && leftCol <= rightCol) {
            switch (direction) {
                case 0:
                    for (int i = leftCol; i <= rightCol; i++) {
                        result.add(matrix[topRow][i]);
                    }
                    topRow++;
                    break;
                case 1:
                    for (int i = topRow; i <= botRow; i++) {
                        result.add(matrix[i][rightCol]);
                    }
                    rightCol--;
                    break;
                case 2:
                    for (int i = rightCol; i >= leftCol; i--) {
                        result.add(matrix[botRow][i]);
                    }
                    botRow--;
                    break;
                case 3:
                    for (int i = botRow; i >= topRow; i--) {
                        result.add(matrix[i][leftCol]);
                    }
                    leftCol++;
                    break;
            }
            direction = (direction + 1) % 4;
        }
        return result;
    }
}
