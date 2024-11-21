package com.example.demo.test2;

public class IntegerToRoman2 {

	public String intToRoman(int num) {

		StringBuilder builder = new StringBuilder();

		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		for (int i = 0; i < values.length; i++) {
			String string = symbols[i];
			int j = values[i];
			while (num >= j) {
				builder.append(string);
				num -= j;

			}
		}
		return builder.toString();

	}

	public static void main(String[] args) {

		IntegerToRoman2 data = new IntegerToRoman2();
		String test1 = data.intToRoman(3749);
		System.out.println(test1);

		String test2 = data.intToRoman(58);
		System.out.println(test2);

	}

}
