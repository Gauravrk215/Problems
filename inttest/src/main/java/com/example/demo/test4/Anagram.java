package com.example.demo.test4;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

	public boolean isAnagram(String s, String t) {

		int slength = s.length();
		int tlength = t.length();

		if (s.isEmpty() || t.isEmpty() || slength != tlength) {
			return false;

		}

		char[] charArray = s.toCharArray();

		char[] charArray2 = t.toCharArray();

		Arrays.sort(charArray);
		Arrays.sort(charArray2);

		boolean equals = Arrays.equals(charArray, charArray2);

		return equals;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anagram solution = new Anagram();

		// Example 1
		System.out.println(solution.isAnagram("anagram", "nagaram")); // Output: true

		// Example 2
		System.out.println(solution.isAnagram("rat", "car")); // Output: false
	}

}
