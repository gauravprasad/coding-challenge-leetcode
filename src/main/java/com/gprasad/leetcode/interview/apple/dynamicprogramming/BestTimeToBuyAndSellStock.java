package com.gprasad.leetcode.interview.apple.dynamicprogramming;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int BUY = Integer.MAX_VALUE;
        int profit = 0;
        for(int price:prices){
            if(price<BUY) BUY = price;
            else profit = Math.max(profit, price-BUY);
        }
        return profit;
    }
}
