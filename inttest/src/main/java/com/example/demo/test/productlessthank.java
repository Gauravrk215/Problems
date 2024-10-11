package com.example.demo.test;

import java.util.Iterator;

public class productlessthank {

public static int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int i = 0;
			int j = 0;
			int n = nums.length;
			int ans = 0;
			int product = 1;
			while (j < n) {
				product *= nums[j];
				while (i <= j && product >= k) {
					product = product / nums[i];
					i++;
				}
				ans += (j - i + 1);
				j++;
			}
			return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 2, 6 };
		int k = 100;
		int numSubarrayProductLessThanK = numSubarrayProductLessThanK(arr, k);
		System.out.println(numSubarrayProductLessThanK);

	}

}
