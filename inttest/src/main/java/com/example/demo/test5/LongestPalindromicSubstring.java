package com.example.demo.test5;

public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
		int n = s.length();
		if (n <= 1)
			return s;

		boolean[][] dp = new boolean[n][n];
		int start = 0, maxLen = 1;

		// All single characters are palindromes
		for (int i = 0; i < n; i++) {
			dp[i][i] = true;
		}

		// Check two-character substrings
		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				dp[i][i + 1] = true;
				start = i;
				maxLen = 2;
			}
		}

		// Check substrings of length 3 or more
		for (int len = 3; len <= n; len++) {
			for (int i = 0; i < n - len + 1; i++) {
				int j = i + len - 1;
				if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
					dp[i][j] = true;
					start = i;
					maxLen = len;
				}
			}
		}

		return s.substring(start, start + maxLen);
	}

	public static void main(String[] args) {
		LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

		// Test Cases
		System.out.println(solution.longestPalindrome("babad")); // Output: "bab" or "aba"
		System.out.println(solution.longestPalindrome("cbbd")); // Output: "bb"
		System.out.println(solution.longestPalindrome("a")); // Output: "a"
		System.out.println(solution.longestPalindrome("racecar")); // Output: "racecar"
		System.out.println(solution.longestPalindrome("abcdef")); // Output: "a", "b", "c", etc.
		System.out.println(solution.longestPalindrome("abacdfgdcaba")); // Output: "aba"
		System.out.println(solution.longestPalindrome("xyzracecarxyz")); // Output: "racecar"
		System.out.println(solution.longestPalindrome("abcddcba")); // Output: "abcddcba"
		System.out.println(solution.longestPalindrome("abcdefggfedcba")); // Output: "abcdefggfedcba"

		// Large Input Test
		String largeInput = "a".repeat(1000);
		System.out.println(solution.longestPalindrome(largeInput)); // Output: Entire string
	}

}
