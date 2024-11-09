package com.example.demo.test3;

public class MinimumSizeSubarraySum {

	public int minSubArrayLen(int target, int[] nums) {
		int minLength = Integer.MAX_VALUE;
		int start = 0;
		int currentSum = 0;

		for (int end = 0; end < nums.length; end++) {
			currentSum += nums[end]; // Expand the window by adding nums[end]

			// Shrink the window from the left as long as the sum is >= target
			while (currentSum >= target) {
				minLength = Math.min(minLength, end - start + 1);
				currentSum -= nums[start]; // Shrink the window from the left
				start++;
			}
		}

		// Return minLength if found, else return 0
		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
