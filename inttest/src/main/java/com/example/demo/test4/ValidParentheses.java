package com.example.demo.test4;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {
		// Step 1: Create a map for closing to opening bracket mapping
		HashMap<Character, Character> bracketMap = new HashMap<>();
		bracketMap.put(')', '(');
		bracketMap.put('}', '{');
		bracketMap.put(']', '[');

		// Step 2: Use a stack to track opening brackets
		Stack<Character> stack = new Stack<>();

		// Step 3: Traverse the string
		for (char c : s.toCharArray()) {
			if (bracketMap.containsKey(c)) {
				// Check if the stack is empty or top doesn't match
				char top = stack.isEmpty() ? '#' : stack.pop();
				if (top != bracketMap.get(c)) {
					return false;
				}
			} else {
				// Push opening brackets onto the stack
				stack.push(c);
			}
		}

		// Step 4: Stack should be empty if all brackets are matched
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		ValidParentheses solution = new ValidParentheses();

		// Test cases
		System.out.println(solution.isValid("()")); // Output: true
		System.out.println(solution.isValid("()[]{}")); // Output: true
		System.out.println(solution.isValid("(]")); // Output: false
		System.out.println(solution.isValid("([)]")); // Output: false
		System.out.println(solution.isValid("{[]}")); // Output: true
	}
}
