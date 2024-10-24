package com.example.demo.test2;

public class Candy {

	public int candy(int[] ratings) {
		int n = ratings.length;
		if (n == 0)
			return 0;

		int[] candies = new int[n];
		// Each child gets at least one candy
		for (int i = 0; i < n; i++) {
			candies[i] = 1;
		}

		// First pass: left to right
		for (int i = 1; i < n; i++) {
			if (ratings[i] > ratings[i - 1]) {
				candies[i] = candies[i - 1] + 1;
			}
		}

		// Second pass: right to left
		for (int i = n - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				candies[i] = Math.max(candies[i], candies[i + 1] + 1);
			}
		}

		// Sum the total candies
		int totalCandies = 0;
		for (int candy : candies) {
			totalCandies += candy;
		}

		return totalCandies;
	}

	public static void main(String[] args) {
		Candy candy = new Candy();
		int candy2 = candy.candy(new int[] { 1, 0, 2 });
		System.out.println(candy2);

	}

}
