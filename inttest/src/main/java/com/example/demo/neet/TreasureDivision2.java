package com.example.demo.neet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class TreasureDivision2 {

	public static int[] solve(int n, long k, int[][] nums) {
        // Step 1: Sort the treasure IDs by ID value
        Arrays.sort(nums, Comparator.comparingInt(o -> o[0]));

        // Initialize variables for the sliding window approach
        long maxValue = 0;
        long currentValue = 0;
        int bestStart = Integer.MAX_VALUE;

        // Use a map to keep track of the active treasures in the sliding window
        TreeMap<Integer, Integer> window = new TreeMap<>();

        int left = 0;

        // Step 2: Process treasures using a sliding window
        for (int right = 0; right < n; right++) {
            int id = nums[right][0];
            int value = nums[right][1];

            // Add the current treasure to the window
            window.put(id, value);
            currentValue += value;

            // Remove treasures outside the interval [id, id + k - 1]
            while (id - window.firstKey() >= k) {
                int removeId = window.firstKey();
                currentValue -= window.remove(removeId);
            }

            // Calculate total value in this interval
            long totalValue = currentValue + (k - (window.lastKey() - window.firstKey() + 1));

            // Update maxValue and bestStart
            if (totalValue > maxValue) {
                maxValue = totalValue;
                bestStart = Math.max(window.firstKey(), id - (int) k + 1);
            } else if (totalValue == maxValue) {
                bestStart = Math.min(bestStart, Math.max(window.firstKey(), id - (int) k + 1));
            }
        }

        // Return result as [maxValue, bestStart]
        return new int[]{(int) maxValue, bestStart};
    }
	public static void main(String[] args) {
		int n = 3;
		int k = 6;
		int[][] nums = { { 5, 7 }, { 1, 17 }, { 8, 19 } };

		int[] result = solve(n, k, nums);
		System.out.println(result[0] + " " + result[1]); // Output: 30 3
	}
}