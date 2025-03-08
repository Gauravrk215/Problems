package com.example.demo.test5;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		backtrack(result, "", 0, 0, n);
		return result;
	}

	private static void backtrack(List<String> result, String current, int open, int close, int max) {
		// Base case: When the current string reaches the maximum length
		if (current.length() == max * 2) {
			result.add(current);
			return;
		}

		// Add '(' if we haven't used all 'n' opening brackets
		if (open < max) {
			backtrack(result, current + "(", open + 1, close, max);
		}

		// Add ')' if we have more '(' than ')'
		if (close < open) {
			backtrack(result, current + ")", open, close + 1, max);
		}
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(generateParenthesis(n)); // Output: ["((()))","(()())","(())()","()(())","()()()"]
	}
}
