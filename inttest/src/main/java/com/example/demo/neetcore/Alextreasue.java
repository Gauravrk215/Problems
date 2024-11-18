package com.example.demo.neetcore;

public class Alextreasue {

	public int solve(int n, int[][] tiles) {
		// DP arrays to store the number of factors of 2 and 5
		int[][] dp2 = new int[n][n];
		int[][] dp5 = new int[n][n];

		// Initialize the DP arrays
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int num = tiles[i][j];

				// Count factors of 2 and 5 for the current number
				int count2 = 0, count5 = 0;
				while (num % 2 == 0 && num > 0) {
					count2++;
					num /= 2;
				}
				num = tiles[i][j]; // Reset the number to count factors of 5
				while (num % 5 == 0 && num > 0) {
					count5++;
					num /= 5;
				}

				// Fill the DP arrays based on the current tile
				if (i == 0 && j == 0) {
					// Starting tile
					dp2[i][j] = count2;
					dp5[i][j] = count5;
				} else if (i == 0) {
					// First row: only comes from the left
					dp2[i][j] = dp2[i][j - 1] + count2;
					dp5[i][j] = dp5[i][j - 1] + count5;
				} else if (j == 0) {
					// First column: only comes from above
					dp2[i][j] = dp2[i - 1][j] + count2;
					dp5[i][j] = dp5[i - 1][j] + count5;
				} else {
					// Rest of the grid: take the minimum path
					dp2[i][j] = Math.min(dp2[i - 1][j], dp2[i][j - 1]) + count2;
					dp5[i][j] = Math.min(dp5[i - 1][j], dp5[i][j - 1]) + count5;
				}
			}
		}

		// The result is the minimum of trailing zeros determined by factors of 2 and 5
		return Math.min(dp2[n - 1][n - 1], dp5[n - 1][n - 1]);
	}

	public static void main(String[] args) {

		Alextreasue tr = new Alextreasue();

		int n = 3;
		int[][] tiles = { { 2, 3, 10 }, { 5, 10, 3 }, { 4, 2, 5 } };

		int solve = tr.solve(n, tiles);
		System.out.println(solve);
		// TODO Auto-generated method stub

	}

}
