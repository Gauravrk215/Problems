package com.example.demo.test4;

import java.util.Arrays;

public class LongestConsecutiveSequence {

	public static int longestConsecutive(int[] nums) {

		if (nums.length == 0) {
			return 0;

		}
		
		if (nums.length == 1) {
			return 1;

		}

		Arrays.sort(nums);

		int out = 1;

		int res = 0;

		for (int i = 1; i < nums.length; i++) {
			int j = nums[i];
			int k = nums[i - 1];

			int l = j - k;
			if (l == 1) {
				out += 1;

				res = Math.max(out, res);

			} else {
				out = 1;
			}

		}
		return res;

	}

	public static void main(String[] args) {

		int i2 = longestConsecutive(new int[] { 9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6 });

		System.out.println(i2);

		int i1 = longestConsecutive(new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 });

		System.out.println(i1);
		int i = longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 });

		System.out.println(i);

	}
}
