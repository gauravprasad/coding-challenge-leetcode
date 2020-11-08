package com.gprasad.leetcode.interview.amazon.arraystring;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int result = 0;
        int h = 0;
        int w = height.length-h;
        while(h<height.length && w>0){
            int wd = w-h;
            int ht = 0;
            if(height[h]<height[w]){
                ht = height[h];
                h++;
            }else {
                ht = height[w];
                w--;
            }
            result = Math.max(result, wd*ht);
        }
        return result;
    }
}
