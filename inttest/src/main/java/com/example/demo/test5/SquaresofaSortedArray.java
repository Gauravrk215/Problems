package com.example.demo.test5;

import java.util.Arrays;

public class SquaresofaSortedArray {

	public static int[] sortedSquares(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		int left = 0, right = n - 1;
		int index = n - 1; // Start filling the result array from the end

		while (left <= right) {
			int leftSquare = nums[left] * nums[left];
			int rightSquare = nums[right] * nums[right];

			if (leftSquare > rightSquare) {
				result[index--] = leftSquare;
				left++;
			} else {
				result[index--] = rightSquare;
				right--;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		System.out.println(Arrays.toString(sortedSquares(nums)));
	}

}
