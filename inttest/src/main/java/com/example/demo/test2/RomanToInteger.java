package com.example.demo.test2;

import java.util.HashMap;

public class RomanToInteger {

	public String intToRoman(int num) {
		// Define values and corresponding Roman symbols
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder roman = new StringBuilder();

		// Iterate over each value-symbol pair
		for (int i = 0; i < values.length; i++) {
			// Determine how many times to append the current symbol
			while (num >= values[i]) {
				roman.append(symbols[i]); // Append symbol
				num -= values[i]; // Subtract value
			}
		}

		return roman.toString();
	}

	public static void main(String[] args) {

		RomanToInteger data = new RomanToInteger();
		String test1 = data.intToRoman(3749);
		System.out.println(test1);

		String test2 = data.intToRoman(58);
		System.out.println(test2);

	}

}
