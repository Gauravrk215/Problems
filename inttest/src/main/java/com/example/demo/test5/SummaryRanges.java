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
		int end = 0;

		for (int i = 0; i < length - 1; i++) {
			int j = nums[i];
			int k = nums[i + 1];

			if (k != j + 1) {

				if (k == start) {
					result.add(String.valueOf(start));

				} else {

					end = j;
					result.add(start + "->" + end);
					start = k;
				}

			}

		}

		if (nums[length-1] != start + 1) {
			result.add(String.valueOf(nums[length-1]));

		} else {
			result.add(start + "->" + nums[length-1]);

		}

		return result;
	}

	public static void main(String[] args) {
		SummaryRanges solution = new SummaryRanges();

		// Test cases
		System.out.println(solution.summaryRanges(new int[] { 0, 1, 2, 4, 5, 7 })); // Output: ["0->2", "4->5", "7"]
		System.out.println(solution.summaryRanges(new int[] { 0, 2, 3, 4, 6, 8, 9 })); // Output: ["0", "2->4", "6",
																						// "8->9"]
		System.out.println(solution.summaryRanges(new int[] { -1 })); // Output: ["-1"]
		System.out.println(solution.summaryRanges(new int[] {})); // Output: []
	}
}
