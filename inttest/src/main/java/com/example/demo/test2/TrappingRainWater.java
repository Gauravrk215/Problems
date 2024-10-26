package com.example.demo.test2;

public class TrappingRainWater {

	public int trap(int[] height) {

		int length = height.length;

		int[] left = new int[length];
		int[] right = new int[length];
		int unit = 0;
		left[0] = height[0];

		for (int i = 1; i < length; i++) {

			left[i] = Math.max(height[i], left[i - 1]);

		}

		right[length - 1] = height[length - 1];

		for (int i = length - 2; i >= 0; i--) {

			right[i] = Math.max(height[i], right[i + 1]);

		}

		for (int i = 0; i < length; i++) {
			unit +=  (Math.min(right[i], left[i]) - height[i]);

		}

		return unit;

	}

	public static void main(String[] args) {

		TrappingRainWater water = new TrappingRainWater();
		int trap = water.trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 });
		System.out.println(trap);

		int trap2 = water.trap(new int[] { 4, 2, 0, 3, 2, 5 });
		System.out.println(trap2);

	}

}
