package com.problems.arrays;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int res = 0;
        int size = prices.length;

        int minSofar = prices[0];
        for(int i = 0; i <size ; i++) {
            minSofar = Math.min(minSofar,prices[i]);
            res = Math.max(res, prices[i]-minSofar);
        }
        return res;
    }
}
