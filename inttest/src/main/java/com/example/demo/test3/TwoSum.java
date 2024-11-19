package com.example.demo.test3;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				int k = nums[i] + nums[j];

				if (k == target) {
					arr[0] = i;
					arr[1] = j;
					break;

				}

			}
		}
		return arr;

	}

	public static void main(String[] args) {

		int[] twoSum = twoSum(new int[] { 2, 7, 11, 15 }, 9);
		System.out.println(twoSum);
		// TODO Auto-generated method stub

	}

}
