package com.example.demo.test;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray2 {

	public int removeDuplicates(int[] nums) {

		int k = 0;

		ArrayList<Integer> list = new ArrayList<>();

		for (int i : nums) {

			if (!list.contains(i)) {
				list.add(i);
				k++;

			}

		}

		for (int i = 0; i < list.size(); i++) {
			nums[i] = list.get(i);

		}
		System.out.println(nums);
		return k;

	}

	public int removeDuplicates2(int[] nums) {

		if (nums.length == 0) {
			return 0;

		}

		int i = 1;

		for (int j = 1; j < nums.length; j++) {

			if (nums[j] != nums[j - 1]) {
				nums[i] = nums[j];
				i++;
			}

		}

		return i;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDuplicatesfromSortedArray2 array = new RemoveDuplicatesfromSortedArray2();

		int duplicates = array.removeDuplicates2(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 });

		System.out.println(duplicates);

	}

}
