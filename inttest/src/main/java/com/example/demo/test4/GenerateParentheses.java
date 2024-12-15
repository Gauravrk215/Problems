package com.example.demo.test4;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	
	  public List<String> generateParenthesis(int n) {
	        List<String> result = new ArrayList<>();
	        backtrack(result, "", 0, 0, n);
	        return result;
	    }

	    private void backtrack(List<String> result, String current, int open, int close, int max) {
	        // Base case: if the current string is valid and complete
	        if (current.length() == max * 2) {
	            result.add(current);
	            return;
	        }

	        // Add an open parenthesis if the count is less than max
	        if (open < max) {
	            backtrack(result, current + "(", open + 1, close, max);
	        }

	        // Add a close parenthesis if it doesn't exceed the open count
	        if (close < open) {
	            backtrack(result, current + ")", open, close + 1, max);
	        }
	    }

	    public static void main(String[] args) {
	    	GenerateParentheses solution = new GenerateParentheses();

	        // Test cases
	        System.out.println(solution.generateParenthesis(3)); // Output: ["((()))","(()())","(())()","()(())","()()()"]
	        System.out.println(solution.generateParenthesis(1)); // Output: ["()"]
	    }

}
