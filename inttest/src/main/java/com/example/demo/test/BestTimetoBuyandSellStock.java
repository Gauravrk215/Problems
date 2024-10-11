package com.example.demo.test;

public class BestTimetoBuyandSellStock {

	public int maxProfit(int[] prices) {

		int output = 0;

		int l = 0;

		for (int i = 0; i < prices.length - 1; i++) {
			for (int k = i + 1; k <= prices.length - 1; k++) {

				int m = prices[k];
				int n = prices[i];

				int o = m - n;

				if (o > l) {
					l = o;

				}

			}

		}
		output = l;

		return output;

	}

//	Aapne jo approach use ki hai usme nested loops hain (do loops ek ke andar).
//	Is wajah se time complexity O(n^2) ho rahi hai, kyunki aap har possible pair ko compare kar rahe ho. 
//	Ye approach small arrays ke liye theek hai, lekin jab array bada hota hai, 
//	toh time complexity ki wajah se time limit exceeded error aa jata hai.

	public static void main(String[] args) {

		BestTimetoBuyandSellStock stock = new BestTimetoBuyandSellStock();

		int maxProfit = stock.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 });

		System.out.println(maxProfit);

	}

}
