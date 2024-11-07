package com.example.demo.test2;

public class ContainerWithMostWater {

//	step 1 find height = horizontal length* index
	public int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;

		while (left < right) {
			int currentHeight = Math.min(height[left], height[right]);
			int currentWidth = right - left;
			int currentArea = currentHeight * currentWidth;

			maxArea = Math.max(maxArea, currentArea);

			// Move the pointer with the shorter line
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}

		return maxArea;
	}

	public static void main(String[] args) {

		ContainerWithMostWater water = new ContainerWithMostWater();
		int maxArea = water.maxArea(new int[] {});
		System.out.println(maxArea);

	}

}
