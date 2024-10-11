package com.example.demo.test;

import java.util.Arrays;

public class MajorityElement {

	public int majorityElement(int[] nums) {

		int j = nums.length / 2;

		Arrays.sort(nums);

		int k = nums[j];

		return k;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MajorityElement element = new MajorityElement();

		int i = element.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 });
		System.out.println(i);

	}

}
