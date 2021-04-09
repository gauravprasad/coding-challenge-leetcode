package com.gprasad.leetcode.interview.apple.arraystring;

public class TrappingRainWater {

    public int trap(int[] height) {
        if(height==null || height.length==0) return 0;
        int[] lMax = new int[height.length];
        lMax[0] = height[0];
        for (int l=1;l<lMax.length;l++){
            lMax[l] = Math.max(lMax[l-1], height[l]);
        }
        int[] rMax = new int[height.length];
        rMax[rMax.length-1]= height[height.length-1];
        for(int r=rMax.length-2;r>=0;r--){
            rMax[r] = Math.max(height[r], rMax[r+1]);
        }
        int result = 0;
        for(int idx=1; idx<height.length;idx++){
            result += Math.min(lMax[idx], rMax[idx])-height[idx];
        }
       return result;
    }

    //bruteforce
    public int trap2(int[] height) {
        int result =0;
        if(height==null || height.length==0) return result;
        for(int idx = 0;idx<height.length;idx++){
            int lMax =height[idx];
            for(int l=0;l<idx;l++){
                lMax = Math.max(lMax, height[l]);
            }
            int rMax = height[idx];
            for (int r = idx+1;r<height.length;r++){
                rMax = Math.max(rMax, height[r]);
            }
            result +=Math.min(lMax,rMax)-height[idx];
        }
        return result;
    }
}
