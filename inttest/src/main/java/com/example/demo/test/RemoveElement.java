package com.example.demo.test;

import java.util.Arrays;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {

		int count = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != val) {

				nums[count++] = nums[i];
			}

		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveElement remover = new RemoveElement();

		int[] nums = { 3, 2, 2, 3, 4, 5 };
		int val = 3;
		int k = remover.removeElement(nums, val);

		System.out.println("Number of elements not equal to " + val + ": " + k);
		System.out.println("Modified array: " + Arrays.toString(nums));
	}

}
