package com.example.demo.test4;

public class FindFirstPalindromicStringintheArray {

	public String firstPalindrome(String[] words) {
		// Iterate through each word in the array
		for (String word : words) {
			if (isPalindrome(word)) {
				return word; // Return the first palindromic string
			}
		}
		return ""; // If no palindrome is found, return an empty string
	}

	// Helper function to check if a string is a palindrome
	private boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false; // Not a palindrome
			}
			left++;
			right--;
		}

		return true; // Palindrome
	}

	public static void main(String[] args) {
		FindFirstPalindromicStringintheArray solution = new FindFirstPalindromicStringintheArray();

		// Test cases
		System.out.println(solution.firstPalindrome(new String[] { "abc", "car", "ada", "racecar", "cool" })); // Output:
																												// "ada"
		System.out.println(solution.firstPalindrome(new String[] { "not", "a", "palindrome" })); // Output: ""
		System.out.println(solution.firstPalindrome(new String[] { "wow", "level", "rotor" })); // Output: "wow"
	}
}
