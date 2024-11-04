package com.example.demo.test2;

public class FindtheIndexoftheFirstOccurrenceinaString2 {

	public int strStr(String haystack, String needle) {
		// Edge cases
		if (needle.isEmpty() || needle.length() > haystack.length()) {
			return -1;

		}

		int indexOf = haystack.indexOf(needle);
		return indexOf;

	}

	public static void main(String[] args) {

		FindtheIndexoftheFirstOccurrenceinaString2 data = new FindtheIndexoftheFirstOccurrenceinaString2();

		int reverseWords = data.strStr("sadbutsad", "sad");

		System.out.println(reverseWords);
		
		int reverseWords2 = data.strStr("leetcode", "leeto");

		System.out.println(reverseWords2);

	}
}
