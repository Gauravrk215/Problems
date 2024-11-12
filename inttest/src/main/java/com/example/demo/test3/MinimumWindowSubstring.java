package com.example.demo.test3;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

	public String minWindow(String s, String t) {
		if (s == null || s.length() == 0 || t == null || t.length() == 0) {
			return "";
		}

		// Create a map to keep track of character counts in t
		Map<Character, Integer> tMap = new HashMap<>();
		for (char c : t.toCharArray()) {
			tMap.put(c, tMap.getOrDefault(c, 0) + 1);
		}

		int required = tMap.size(); // Number of unique characters in t that need to be in the window
		int left = 0, right = 0, formed = 0;
		int minLength = Integer.MAX_VALUE, minLeft = 0;

		// Map to keep track of the window's character counts
		Map<Character, Integer> windowCounts = new HashMap<>();

		while (right < s.length()) {
			// Add the character from the right pointer to the window
			char c = s.charAt(right);
			windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

			// Check if the current character satisfies the requirement for t
			if (tMap.containsKey(c) && windowCounts.get(c).equals(tMap.get(c))) {
				formed++;
			}

			// Try to contract the window from the left if all characters are satisfied
			while (left <= right && formed == required) {
				c = s.charAt(left);

				// Update the result if this window is smaller
				if (right - left + 1 < minLength) {
					minLength = right - left + 1;
					minLeft = left;
				}

				// Remove the left character from the window
				windowCounts.put(c, windowCounts.get(c) - 1);
				if (tMap.containsKey(c) && windowCounts.get(c) < tMap.get(c)) {
					formed--;
				}

				left++; // Move left pointer to the right
			}

			// Expand the window by moving right pointer to the right
			right++;
		}

		return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
	}

	public static void main(String[] args) {

		MinimumWindowSubstring wind = new MinimumWindowSubstring();

		String minWindow = wind.minWindow("ADOBECODEBANC", "ABC");
		System.out.println(minWindow);

	}

}
