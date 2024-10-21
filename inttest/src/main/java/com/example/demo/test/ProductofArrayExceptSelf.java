package com.example.demo.test;

public class ProductofArrayExceptSelf {

	
	 public int[] productExceptSelf(int[] nums) {
	        int n = nums.length;
	        int[] answer = new int[n];

	        // Step 1: Fill the answer array with products of left side
	        answer[0] = 1;  // There are no elements to the left of the first element
	        for (int i = 1; i < n; i++) {
	            answer[i] = answer[i - 1] * nums[i - 1];
	        }

	        // Step 2: Multiply with products from the right side
	        int rightProduct = 1;  // Initially, there are no elements to the right of the last element
	        for (int i = n - 1; i >= 0; i--) {
	            answer[i] = answer[i] * rightProduct;
	            rightProduct *= nums[i];  // Update the running product for the right side
	        }

	        return answer;
	    }
}
