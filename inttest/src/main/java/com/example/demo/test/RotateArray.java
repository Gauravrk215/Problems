package com.example.demo.test;

import java.util.ArrayList;

public class RotateArray {

	public void rotate(int[] nums, int k) {

		reverse(0, nums.length - 1, nums);

		reverse(0, k - 1, nums);
		reverse(k, nums.length - 1, nums);

		ArrayList<Object> list = new ArrayList<>();
		for (int i : nums) {
			list.add(i);
		}

		System.out.println(list);

	}

	public void reverse(int start, int end, int[] nums) {

		while (start < end) {

			int l = nums[start];

			nums[start] = nums[end];
			nums[end] = l;

			start++;
			end--;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1 = { -1, -100, 3, 99 };
		int k = 2;

		RotateArray array = new RotateArray();
		array.rotate(num1, k);
	}

}
