package com.example.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		ArrayList<Integer> hashSet1 = new ArrayList<Integer>();

		for (int i = 0; i < m; i++) {
			hashSet1.add(nums1[i]);

		}

		for (int i = 0; i < n; i++) {
			hashSet1.add(nums2[i]);

		}

		Collections.sort(hashSet1);

		for (int i = 0; i < hashSet1.size(); i++) {

			nums1[i] = hashSet1.get(i);

		}

		System.out.println(nums1);

	}

	public static void merge2(int[] nums1, int m, int[] nums2, int n) {

		// Step 1: Pointers ko initialize karna
		int i = m - 1; // nums1 ke last valid element par
		int j = n - 1; // nums2 ke last element par
		int k = m + n - 1; // nums1 ke end par (jahan elements ko place karenge)

		// Step 2: Arrays ko end se merge karna
		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}

		// Step 3: Agar nums2 ke elements bach jaate hain, to unhe copy karna
		while (j >= 0) {
			nums1[k--] = nums2[j--];
		}

		// Agar nums1 ke elements bache hain, to unhe move karne ki zaroorat nahi hai

	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 }; // nums1 ka size m + n
		int m = 3; // nums1 ke valid elements
		int[] nums2 = { 2, 5, 6 }; // nums2 ke elements
		int n = 3;

		merge2(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]

	}

}
