package com.example.demo.test;

public class BestTimetoBuyandSellStock2 {

	public int maxProfit(int[] prices) {

		int minPrice = Integer.MAX_VALUE; // To store the minimum price encountered
		int maxProfit = 0; // To store the maximum profit

		for (int i = 0; i < prices.length; i++) {

			if (prices[i] < minPrice) {
				minPrice = prices[i];

			}

			else if (prices[i] - minPrice > maxProfit) {

				maxProfit = prices[i] - minPrice;

			}

		}

		return maxProfit;

	}

//	Aapne jo approach use ki hai usme nested loops hain (do loops ek ke andar).
//	Is wajah se time complexity O(n^2) ho rahi hai, kyunki aap har possible pair ko compare kar rahe ho. 
//	Ye approach small arrays ke liye theek hai, lekin jab array bada hota hai, 
//	toh time complexity ki wajah se time limit exceeded error aa jata hai.

	public static void main(String[] args) {

		BestTimetoBuyandSellStock2 stock = new BestTimetoBuyandSellStock2();

		int maxProfit = stock.maxProfit(new int[] { 1, 2 });

		System.out.println(maxProfit);

	}

}
