package com.example.demo.neet;

public class TreasureDivision21 {

	public static int[] solve(int n, int k, int[][] nums) {
		int[] idValue = new int[1000000000]; // Initialize array to store treasure values
		// Populate idValue array with treasure values
		for (int i = 0; i < n; i++) {
			idValue[nums[i][0]] = nums[i][1];
		}
		int maxValue = 0;
		int startIndex = 0;
		// Slide window of size k to find maximum treasure value
		for (int i = 0; i <= idValue.length - k; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += idValue[j];
			}
			if (sum > maxValue) {
				maxValue = sum;
				startIndex = i;
			}
		}
		return new int[] { maxValue, startIndex };
	}

	public static void main(String[] args) {
		int n = 3;
		int k = 6;
		int[][] nums = { { 5, 7 }, { 1, 17 }, { 8, 19 } };
		int[] result = solve(n, k, nums);
		System.out.println("Maximum treasure value: " + result[0]);
		System.out.println("Start index: " + result[1]);
	}
}