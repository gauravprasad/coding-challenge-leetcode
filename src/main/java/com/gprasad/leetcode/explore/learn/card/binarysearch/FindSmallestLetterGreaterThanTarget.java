package com.gprasad.leetcode.explore.learn.card.binarysearch;

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        if (target < letters[0] || target >= letters[letters.length - 1]) return letters[0];
        int low = 0, high = letters.length - 1;
        char nextHigh = '-';
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] <= target) low = mid + 1;
            else high = mid;
        }
        return letters[low % letters.length];
    }
}
