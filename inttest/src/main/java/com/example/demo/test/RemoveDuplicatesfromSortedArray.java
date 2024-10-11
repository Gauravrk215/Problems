package com.example.demo.test;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {

	public int removeDuplicates(int[] nums) {

		int l = 0;
		int m = 0;

		for (int i = 1; i < nums.length; i++) {

			int j = nums[i];
			int k = nums[i - 1];
			if (j == k) {

				l++;

			} else {
				l = 0;
			}

			if (l == 1) {

				nums[m] = j;
				nums[++m] = k;
				m++;

			}

		}

		ArrayList<Integer> list = new ArrayList<>();

		for (int i : nums) {
			list.add(i);

		}
		System.out.println(list);

		return m;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDuplicatesfromSortedArray array = new RemoveDuplicatesfromSortedArray();

		int duplicates = array.removeDuplicates(new int[] { 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 });

		System.out.println(duplicates);

	}

}
