package com.example.demo.test;

public class BestTimetoBuyandSellStock3 {

	public int maxProfit(int[] prices) {
		int maxProfit = 0; // Initialize the maximum profit to 0

		// Loop through the array
		for (int i = 1; i < prices.length; i++) {
			// If the price on day i is greater than the price on day i-1

			int m = prices[i];
			int n = prices[i - 1];
			if (m > n) {
				// Add the difference to the total profit
				maxProfit += prices[i] - prices[i - 1];
			}
		}

		return maxProfit; // Return the maximum profit
	}

//	Aapne jo approach use ki hai usme nested loops hain (do loops ek ke andar).
//	Is wajah se time complexity O(n^2) ho rahi hai, kyunki aap har possible pair ko compare kar rahe ho. 
//	Ye approach small arrays ke liye theek hai, lekin jab array bada hota hai, 
//	toh time complexity ki wajah se time limit exceeded error aa jata hai.

	public static void main(String[] args) {

		BestTimetoBuyandSellStock3 stock = new BestTimetoBuyandSellStock3();

		int maxProfit = stock.maxProfit(new int[] { 2, 1, 2, 3, 4, 5, 6, 8, 3, 4, 5, 6, 7, 9 });

		System.out.println(maxProfit);

	}

}
