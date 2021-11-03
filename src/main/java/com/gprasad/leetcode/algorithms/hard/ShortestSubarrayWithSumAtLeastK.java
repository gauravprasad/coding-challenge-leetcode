package com.gprasad.leetcode.algorithms.hard;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class ShortestSubarrayWithSumAtLeastK {
    public int shortestSubarray(int[] nums, int k) {
        int count = -1;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            int j = i + 1;
            while (j < nums.length && sum < k) {
                sum += nums[j++];
            }
            count = sum >= k ? count == -1 ? Arrays.copyOfRange(nums, i, j).length : Math.min(Arrays.copyOfRange(nums, i, j).length, count) : count;
        }
        return count;
    }
}
/*class Solutionz {
    public int shortestSubarray(int[] A, int K) {
        int N = A.length;
        long[] P = new long[N+1];
        for (int i = 0; i < N; ++i)
            P[i+1] = P[i] + (long) A[i];

        // Want smallest y-x with P[y] - P[x] >= K
        int ans = N+1; // N+1 is impossible
        Deque<Integer> monoq = new LinkedList<>(); //opt(y) candidates, as indices of P

        for (int y = 0; y < P.length; ++y) {
            // Want opt(y) = largest x with P[x] <= P[y] - K;
            while (!monoq.isEmpty() && P[y] <= P[monoq.getLast()])
                monoq.removeLast();
            while (!monoq.isEmpty() && P[y] >= P[monoq.getFirst()] + K)
                ans = Math.min(ans, y - monoq.removeFirst());

            monoq.addLast(y);
        }

        return ans < N+1 ? ans : -1;
    }
}*/
