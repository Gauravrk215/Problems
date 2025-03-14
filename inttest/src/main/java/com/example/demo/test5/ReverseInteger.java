package com.example.demo.test5;

public class ReverseInteger {

	public int reverse(int x) {
		int rev = 0;

		while (x != 0) {
			int digit = x % 10;

			// Check for overflow before multiplying by 10
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
				return 0; // Overflow case for positive numbers
			}
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
				return 0; // Overflow case for negative numbers
			}

			rev = rev * 10 + digit;
			x /= 10;
		}

		return rev;
	}

	public static void main(String[] args) {
		ReverseInteger solution = new ReverseInteger();

		// Test cases
		System.out.println(solution.reverse(123)); // Output: 321
		System.out.println(solution.reverse(-123)); // Output: -321
		System.out.println(solution.reverse(120)); // Output: 21
		System.out.println(solution.reverse(0)); // Output: 0
		System.out.println(solution.reverse(1534236469)); // Output: 0 (Overflow)
	}

}
