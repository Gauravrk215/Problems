package com.example.demo.test4;

import java.util.HashMap;

public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			// If the number already exists in the map, check the index difference
			if (map.containsKey(nums[i])) {
				int prevIndex = map.get(nums[i]);
				if (Math.abs(i - prevIndex) <= k) {
					return true;
				}
			}
			// Update the map with the current index
			map.put(nums[i], i);
		}

		return false;
	}

	public static void main(String[] args) {
		ContainsDuplicateII solution = new ContainsDuplicateII();

		// Test cases
		System.out.println(solution.containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3)); // Output: true
		System.out.println(solution.containsNearbyDuplicate(new int[] { 1, 0, 1, 1 }, 1)); // Output: true
		System.out.println(solution.containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2)); // Output: false
	}
}