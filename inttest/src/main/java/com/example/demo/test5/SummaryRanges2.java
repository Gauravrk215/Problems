package com.example.demo.test5;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges2 {
	public List<String> summaryRanges(int[] nums) {
		List<String> result = new ArrayList<>();

		if (nums == null || nums.length == 0) {
			return result;
		}

		int start = nums[0]; // Start of the current range

		for (int i = 1; i < nums.length; i++) {
			// If the current number is not consecutive
			if (nums[i] != nums[i - 1] + 1) {
				// Add the range to the result
				if (start == nums[i - 1]) {
					result.add(String.valueOf(start));
				} else {
					result.add(start + "->" + nums[i - 1]);
				}
				// Start a new range
				start = nums[i];
			}
		}

		// Add the last range
		if (start == nums[nums.length - 1]) {
			result.add(String.valueOf(start));
		} else {
			result.add(start + "->" + nums[nums.length - 1]);
		}

		return result;
	}

	public static void main(String[] args) {
		SummaryRanges2 solution = new SummaryRanges2();

		// Test cases
		System.out.println(solution.summaryRanges(new int[] { 0, 1, 2, 4, 5, 7 })); // Output: ["0->2", "4->5", "7"]
		System.out.println(solution.summaryRanges(new int[] { 0, 2, 3, 4, 6, 8, 9 })); // Output: ["0", "2->4", "6",
																						// "8->9"]
		System.out.println(solution.summaryRanges(new int[] { -1 })); // Output: ["-1"]
		System.out.println(solution.summaryRanges(new int[] {})); // Output: []
	}
}
