package com.example.demo.test2;

public class LongestCommonPrefix {

//	Write a function to find the longest common prefix string amongst an array of strings.
//
//	If there is no common prefix, return an empty string "".

	public String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0) {
			return "";
		}

		// Take the first string as the initial common prefix
		String prefix = strs[0];

		// Compare this prefix with each string in the array
		for (int i = 1; i < strs.length; i++) {
			// Reduce the prefix until it matches the start of strs[i]
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1); // Remove last character
				if (prefix.isEmpty()) {
					return ""; // No common prefix
				}
			}
		}

		return prefix;
	}

	public static void main(String[] args) {

		LongestCommonPrefix data = new LongestCommonPrefix();
		String word = data.longestCommonPrefix(new String[] { "flower", "flow", "flight" });
		System.out.println(word);

	}

}
