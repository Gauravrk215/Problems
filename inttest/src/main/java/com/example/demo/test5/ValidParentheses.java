package com.example.demo.test5;

import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch); // Push opening brackets
			} else {
				if (stack.isEmpty())
					return false; // No opening bracket for closing one
				char top = stack.pop();
				if (!isMatchingPair(top, ch))
					return false; // Check matching pairs
			}
		}

		return stack.isEmpty(); // Stack should be empty if all brackets are balanced
	}

	private static boolean isMatchingPair(char open, char close) {
		return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
	}

	public static void main(String[] args) {
		String s = "{[()]}";
		System.out.println(isValid(s)); // Output: true
	}
}
