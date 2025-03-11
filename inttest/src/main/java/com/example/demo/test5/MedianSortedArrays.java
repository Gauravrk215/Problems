package com.example.demo.test5;

public class MedianSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		// Ensure nums1 is the smaller array
		if (nums1.length > nums2.length) {
			return findMedianSortedArrays(nums2, nums1);
		}

		int m = nums1.length, n = nums2.length;
		int leftPartitionSize = (m + n + 1) / 2; // Left half size
		int low = 0, high = m;

		while (low <= high) {
			int i = (low + high) / 2; // Partition nums1
			int j = leftPartitionSize - i; // Partition nums2

			int nums1Left = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
			int nums1Right = (i == m) ? Integer.MAX_VALUE : nums1[i];

			int nums2Left = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
			int nums2Right = (j == n) ? Integer.MAX_VALUE : nums2[j];

			// Valid partition found
			if (nums1Left <= nums2Right && nums2Left <= nums1Right) {
				// Odd case: max of left side
				if ((m + n) % 2 == 1) {
					return Math.max(nums1Left, nums2Left);
				}
				// Even case: avg of two middle elements
				return (Math.max(nums1Left, nums2Left) + Math.min(nums1Right, nums2Right)) / 2.0;
			}
			// Move towards a valid partition
			else if (nums1Left > nums2Right) {
				high = i - 1; // Move left
			} else {
				low = i + 1; // Move right
			}
		}

		throw new IllegalArgumentException("Input arrays are not sorted");
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2 };
		System.out.println(findMedianSortedArrays(nums1, nums2)); // Output: 2.0

		int[] nums3 = { 1, 2 };
		int[] nums4 = { 3, 4 };
		System.out.println(findMedianSortedArrays(nums3, nums4)); // Output: 2.5
	}
}
