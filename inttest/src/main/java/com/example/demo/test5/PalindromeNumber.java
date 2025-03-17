package com.example.demo.test5;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		// Step 1: Handle negative numbers and numbers ending in 0 (except 0 itself)
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}

		int reversed = 0;
		int original = x;

		// Step 2: Reverse half of the number
		while (x > reversed) {
			reversed = reversed * 10 + x % 10;
			x /= 10;
		}

		// Step 3: Check if it's a palindrome
		return x == reversed || x == reversed / 10;
	}

	public static void main(String[] args) {
		PalindromeNumber solution = new PalindromeNumber();

		// Test cases
		System.out.println(solution.isPalindrome(121)); // Output: true
		System.out.println(solution.isPalindrome(-121)); // Output: false
		System.out.println(solution.isPalindrome(10)); // Output: false
		System.out.println(solution.isPalindrome(1221)); // Output: true
		System.out.println(solution.isPalindrome(0)); // Output: true
	}
}
