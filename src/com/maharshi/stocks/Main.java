package com.maharshi.stocks;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[] { 7, 1, 5, 3, 6, 4 };
		System.out.println("Max Profit : " + maxProfit(a));
	}

	public static int maxProfit(int[] prices) {
		int i = 0;
		int j = 0;
		int maxProfit = 0;
		while (j < prices.length) {
			if (prices[i] > prices[j]) {
				i = j;
			} else {
				maxProfit = Math.max(prices[j] - prices[i], maxProfit);
				j++;
			}
		}
		return maxProfit;
	}

}
