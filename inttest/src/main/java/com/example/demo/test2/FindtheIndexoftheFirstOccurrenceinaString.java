package com.example.demo.test2;

public class FindtheIndexoftheFirstOccurrenceinaString {

	public int strStr(String haystack, String needle) {
        // Edge cases
        if (needle.isEmpty()) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }

        int needleLength = needle.length();
        
        // Sliding window over haystack
        for (int i = 0; i <= haystack.length() - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; // Found the needle
            }
        }

        return -1; // No match found
    }
	
	public static void main(String[] args) {

		FindtheIndexoftheFirstOccurrenceinaString data = new FindtheIndexoftheFirstOccurrenceinaString();

		int reverseWords = data.strStr("sadbutsad","sad");

		System.out.println(reverseWords);

		
	}
}
