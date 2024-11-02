package com.example.demo.test2;

public class ZigzagConversion {

//	Question
//	The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
//		(you may want to display this pattern in a fixed font for better legibility)
//
//	P   A   H   N
//	A P L S I I G
//	Y   I   R
//	And then read line by line: "PAHNAPLSIIGYIR"
//
//	Write the code that will take a string and make this conversion given a number of rows:
//
//	string convert(string s, int numRows);

//	Solution
//	step1 - first find how many char in first row
//	step2- second last se one digit first then go on

	 public String convert(String s, int numRows) {
	        // Edge case: if numRows is 1 or greater than or equal to string length
	        if (numRows == 1 || numRows >= s.length()) {
	            return s;
	        }

	        // Initialize StringBuilder array for each row
	        StringBuilder[] rows = new StringBuilder[numRows];
	        for (int i = 0; i < numRows; i++) {
	            rows[i] = new StringBuilder();
	        }

	        int currentRow = 0;
	        boolean goingDown = false;

	        // Traverse each character in the string
	        for (char c : s.toCharArray()) {
	            rows[currentRow].append(c);

	            // Reverse direction if reaching top or bottom row
	            if (currentRow == 0 || currentRow == numRows - 1) {
	                goingDown = !goingDown;
	            }

	            // Move up or down based on direction
	            currentRow += goingDown ? 1 : -1;
	        }

	        // Combine all rows to get the final result
	        StringBuilder result = new StringBuilder();
	        for (StringBuilder row : rows) {
	            result.append(row);
	        }

	        return result.toString();
	    }

	public static void main(String[] args) {

		ZigzagConversion data = new ZigzagConversion();

		String reverseWords = data.convert("PAYPALISHIRING", 3);

		System.out.println(reverseWords);

		String reverseWords2 = data.convert("PAYPALISHIRING", 4);

		System.out.println(reverseWords2);
	}

}
