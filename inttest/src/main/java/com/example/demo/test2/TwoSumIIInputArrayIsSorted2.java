package com.example.demo.test2;

import java.util.ArrayList;

public class TwoSumIIInputArrayIsSorted2 {

//	step 1 in for loop minus ith number from target
//	stepn 2 find that number on that array
//	if got then record that index either go next

	public int[] twoSum(int[] numbers, int target) {

		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {

			int k = numbers[left] + numbers[right];

			if (k == target) {
				return new int[] { left + 1, right + 1 }; // return 1-indexed positions

			} else if (k < target) {
				left++;

			} else {
				right--;
			}
		}

		return new int[0];

	}

//	 got time limit exceed error better for small array

	public static void main(String[] args) {

		TwoSumIIInputArrayIsSorted2 sorted = new TwoSumIIInputArrayIsSorted2();

		int[] twoSum1 = sorted.twoSum(new int[] { 5, 25, 75 }, 100);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < twoSum1.length; i++) {
			list.add(twoSum1[i]);
			
		}

		System.out.println(list);

		int[] twoSum = sorted.twoSum(new int[] { 2, 7, 11, 15 }, 9);
		System.out.println(twoSum);
	}

}
