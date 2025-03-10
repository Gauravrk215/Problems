package com.example.demo.test5;

import java.util.Stack;

public class LongestValidParentheses2 {
	public static int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<>();
		stack.push(-1); // Base index
		int maxLength = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i); // Store index of '('
			} else {
				stack.pop(); // Pop matching '('
				if (stack.isEmpty()) {
					stack.push(i); // Reset base index
				} else {
					Integer peek = stack.peek();
					maxLength = Math.max(maxLength, i - peek);
				}
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		String s = "(()))())(";
		System.out.println(longestValidParentheses(s)); // Output: 4
	}

}
