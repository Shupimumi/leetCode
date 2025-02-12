package com.company.bestTimeToBuyAndSellStock;

public class Solution {
    public static void main(String[] args) {
        int[] prices = new int[]{1, 10};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int currentProfit = 0;
        int lastProfit = 0;
        int profit = 0;
        if (prices.length == 0)
            return 0;
        if (prices.length == 1)
            return 0;
        for (int i = prices.length - 1; i > 0; i--) {
            for (int k = i - 1; k > -1; k--) {
                currentProfit = prices[i] - prices[k] > 0 ? prices[i] - prices[k] : currentProfit;
                profit = Math.max(profit, Math.max(lastProfit, currentProfit));
                lastProfit = prices[i] - prices[k];
            }
        }
        return profit;
    }
}
