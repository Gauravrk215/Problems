package com.example.demo.test5;

public class StringToIntezer {

	public int myAtoi(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		int index = 0, sign = 1, result = 0;
		int n = s.length();

		// Step 1: Ignore leading whitespace
		while (index < n && s.charAt(index) == ' ') {
			index++;
		}

		// Step 2: Check for sign
		if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
			sign = (s.charAt(index) == '-') ? -1 : 1;
			index++;
		}

		// Step 3: Read digits and convert to integer
		while (index < n && Character.isDigit(s.charAt(index))) {
			int digit = s.charAt(index) - '0';

			// Step 4: Check for overflow before multiplying by 10
			if (result > (Integer.MAX_VALUE - digit) / 10) {
				return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}

			result = result * 10 + digit;
			index++;
		}

		// Step 5: Apply sign and return result
		return result * sign;
	}

	public static void main(String[] args) {
		StringToIntezer solution = new StringToIntezer();

		// Test cases
		System.out.println(solution.myAtoi("42")); // Output: 42
		System.out.println(solution.myAtoi("   -42")); // Output: -42
		System.out.println(solution.myAtoi("4193 with words")); // Output: 4193
		System.out.println(solution.myAtoi("words and 987")); // Output: 0
		System.out.println(solution.myAtoi("-91283472332")); // Output: -2147483648 (overflow case)
		System.out.println(solution.myAtoi("21474836460")); // Output: 2147483647 (overflow case)
		System.out.println(solution.myAtoi("+1")); // Output: 1
	}
}
