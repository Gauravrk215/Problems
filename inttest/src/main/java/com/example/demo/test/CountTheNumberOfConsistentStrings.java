package com.example.demo.test;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistentStrings {

	public static int countConsistentStrings(String allowed, String[] words) {

		int out = 0;
		Set<Character> allowedSet = new HashSet<>();

		char[] array = allowed.toCharArray();
		for (char c : array) {
			allowedSet.add(c);

		}

		for (String word : words) {

			char[] charArray = word.toCharArray();

			boolean isconsistent = true;

			for (char c : charArray) {

				if (!allowedSet.contains(c)) {
					isconsistent = false;
					break;

				}

			}

			if (isconsistent) {
				out++;
			}

		}
		return out;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Example 1:
		String allowed = "ab";
		String[] words = { "ad", "bd", "aaab", "baa", "badab" };
		System.out.println(countConsistentStrings(allowed, words)); // Output: 2

		// Example 2:
		String allowed2 = "abc";
		String[] words2 = { "a", "b", "c", "ab", "ac", "bc", "abc" };
		System.out.println(countConsistentStrings(allowed2, words2)); // Output: 7
	}

}
