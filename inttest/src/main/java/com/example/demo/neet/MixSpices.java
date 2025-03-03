package com.example.demo.neet;

public class MixSpices {

	public static int solve(int n, int[] spices, int target) {
		int minDiff = Integer.MAX_VALUE;
		int closestMatch = 0;
		for (int i = 0; i < (1 << n); i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					sum += spices[j];
				}
			}
			int diff = Math.abs(target - sum);
			if (diff < minDiff) {
				minDiff = diff;
				closestMatch = sum;
			}
		}
		return Math.abs(target - closestMatch);
	}

	public static void main(String[] args) {
		int n = 4;
		int[] spices = { -1, 5, -7, 9 };
		int target = 3;
		System.out.println(solve(n, spices, target)); // Output: 1
	}

}
