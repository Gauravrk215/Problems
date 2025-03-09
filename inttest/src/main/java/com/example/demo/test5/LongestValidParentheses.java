package com.example.demo.test5;

import java.util.Stack;

public class LongestValidParentheses {
	public static int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<>();
		stack.push(-1); // Initial base case for valid substring calculations
		int maxLength = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i); // Push index of '('
			} else {
				stack.pop(); // Pop matching '(' or base case (-1)
				if (stack.isEmpty()) {
					stack.push(i); // Reset base for future calculations
				} else {
					maxLength = Math.max(maxLength, i - stack.peek());
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
