package com.example.demo.test4;

import java.util.HashSet;

public class HappyNumber {

	public boolean isHappy(int n) {

		HashSet<Integer> set = new HashSet<>();

		while (n != 1) {

			if (set.contains(n)) {

				return false;
			}

			set.add(n);

			n = sumOfSquares(n);

		}

		// If we reach 1, the number is happy
		return true;
	}

	public int sumOfSquares(int n) {

		int sum = 0;

		while (n > 0) {

			int digit = n % 10;

			sum += digit * digit;

			n = n / 10;

		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HappyNumber solution = new HappyNumber();

		// Test cases
		System.out.println(solution.isHappy(19)); // Output: true
		System.out.println(solution.isHappy(2)); // Output: false

	}

}
