package com.example.demo.test3;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters2 {

	public static int lengthOfLongestSubstring(String s) {

		HashMap<Character, Integer> hashMap = new HashMap<>();

		int l = 0;
		int r = 0;
		int maxlength = 0;
		int length = s.length();

		while (r < length) {
			char charAt = s.charAt(r);

			Integer integer = hashMap.get(charAt);

			if (hashMap.containsKey(charAt)) {
				l = Math.max(l, integer + 1);

			}

			int strlen = r - l + 1;
			maxlength = Math.max(maxlength, strlen);

			hashMap.put(charAt, r);

			r++;

		}

		return maxlength;

	}

	public static void main(String[] args) {

		int substring1 = lengthOfLongestSubstring("tmmzuxt");
		System.out.println(substring1);

		int substring2 = lengthOfLongestSubstring("pwwkew");
		System.out.println(substring2);

		int substring = lengthOfLongestSubstring("abcabcbb");
		System.out.println(substring);

	}

}
