package com.example.demo.neetcore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MixSpices2 {

	public static int solve(int n, int[] spices, int target) {
		// Step 1: Split the array into two halves
		int[] left1 = Arrays.copyOfRange(spices, 0, n / 2);
		int[] right1 = Arrays.copyOfRange(spices, n / 2, n);

		// Step 2: Generate all subset sums for both halves
		List<Integer> leftSums = new ArrayList<>();
		List<Integer> rightSums = new ArrayList<>();

		// Generate left sums
		int leftSize = left1.length;
		for (int mask = 0; mask < (1 << leftSize); mask++) {
			int sum = 0;
			for (int i = 0; i < leftSize; i++) {
				if ((mask & (1 << i)) != 0) {
					sum += left1[i];
				}
			}
			leftSums.add(sum);
		}

		// Generate right sums
		int rightSize = right1.length;
		for (int mask = 0; mask < (1 << rightSize); mask++) {
			int sum = 0;
			for (int i = 0; i < rightSize; i++) {
				if ((mask & (1 << i)) != 0) {
					sum += right1[i];
				}
			}
			rightSums.add(sum);
		}

		// Step 3: Sort the right sums for binary search
		Collections.sort(rightSums);

		// Step 4: Find the closest match
		int minDiff = Integer.MAX_VALUE;

		for (int leftSum : leftSums) {
			int complement = target - leftSum; // What we want from right sums
			int closest = rightSums.get(0);

			// Binary search to find the closest sum in the right part
			int left = 0, right = rightSums.size() - 1;
			while (left <= right) {
				int mid = left + (right - left) / 2;

				if (Math.abs(rightSums.get(mid) - complement) < Math.abs(closest - complement)) {
					closest = rightSums.get(mid);
				}

				if (rightSums.get(mid) < complement) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}

			// Update the minimum difference
			minDiff = Math.min(minDiff, Math.abs(target - (leftSum + closest)));
		}

		return minDiff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		int[] spices = { -1, 5, -7, 9 };
		int target = 3;
		System.out.println(solve(n, spices, target)); // Output: 1
	}

}
