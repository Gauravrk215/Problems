package com.example.demo.test5;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
		List<String> result = new ArrayList<>();

		if (nums == null || nums.length == 0) {
			return result;

		}
		int length = nums.length;

		int start = nums[0];

		for (int i = 1; i < length; i++) {

			if (nums[i] != nums[i - 1] + 1) {

				if (nums[i - 1] == start) {
					result.add(String.valueOf(start));

				} else {

					result.add(start + "->" + nums[i - 1]);

				}
				start = nums[i];

			}

		}

		if (nums[length - 1] == start) {
			result.add(String.valueOf(start));

		} else {
			result.add(start + "->" + nums[length - 1]);

		}

		return result;
	}

	public static void main(String[] args) {
		SummaryRanges solution = new SummaryRanges();

		// Test cases
		System.out.println(solution.summaryRanges(new int[] { 0, 1, 2 })); // Output: ["0->2", "4->5", "7"]

		System.out.println(solution.summaryRanges(new int[] { 0, 1, 2, 4, 5, 7 })); // Output: ["0->2", "4->5", "7"]
		System.out.println(solution.summaryRanges(new int[] { 0, 2, 3, 4, 6, 8, 9 })); // Output: ["0", "2->4", "6",
																						// "8->9"]
		System.out.println(solution.summaryRanges(new int[] { -1 })); // Output: ["-1"]
		System.out.println(solution.summaryRanges(new int[] {})); // Output: []
	}
}
