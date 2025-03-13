package com.example.demo.test5;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {

	public String convert(String s, int numRows) {
		if (numRows == 1 || numRows >= s.length()) {
			return s;
		}

		// Create a list of StringBuilders for each row
		List<StringBuilder> rows = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			rows.add(new StringBuilder());
		}

		int curRow = 0;
		boolean goingDown = false;

		// Traverse the string and append characters to the appropriate row
		for (char c : s.toCharArray()) {
			rows.get(curRow).append(c);

			// Change direction when reaching the top or bottom row
			if (curRow == 0 || curRow == numRows - 1) {
				goingDown = !goingDown;
			}

			curRow += goingDown ? 1 : -1;
		}

		// Combine all rows into a single string
		StringBuilder result = new StringBuilder();
		for (StringBuilder row : rows) {
			result.append(row);
		}

		return result.toString();
	}

	public static void main(String[] args) {
		ZigzagConversion solution = new ZigzagConversion();

		// Test cases
		System.out.println(solution.convert("PAYPALISHIRING", 3)); // Output: "PAHNAPLSIIGYIR"
		System.out.println(solution.convert("PAYPALISHIRING", 4)); // Output: "PINALSIGYAHRPI"
		System.out.println(solution.convert("A", 1)); // Output: "A"
	}

}
