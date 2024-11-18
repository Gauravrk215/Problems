package com.example.demo.neetcore;

import java.util.ArrayList;

public class Alextreasue2 {

	public int solve(int n, int[][] tiles) {

		int i = 0;
		int j = 0;
		ArrayList<Integer> list = new ArrayList<>();
		int k = tiles[i][j];
		list.add(k);

		int count2 = 0;
		int count5 = 0;

		while (i < n && j < n) {

			if (i != n - 1 && j != n - 1) {

				int k1 = tiles[i][j + 1];
				int k2 = tiles[i + 1][j];

				int min = min(k1, k2);

				if (min == k1) {
					if (j < n) {

						j++;
					}

				} else {
					if (i < n) {

						i++;
					}
				}
				list.add(min);
			} else {

				if (i == n - 1 && j == n - 1) {
					i++;
					j++;

				} else if (i == n - 1) {
					list.add(tiles[i][j + 1]);

					j++;
				} else if (j == n - 1) {
					list.add(tiles[i + 1][j]);

					i++;
				}
			}

		}

		System.out.println(list);

		for (Integer integer : list) {
			int factor2 = factor(integer, 2);

			count2 += factor2;
			int factor5 = factor(integer, 5);
			count5 += factor5;

		}

		int max = Math.max(count2, count5);
		return max;

	}

	public int min(int x, int y) {

		int xfactor2 = factor(x, 2);
		int xfactor5 = factor(x, 5);
		int totalx = xfactor2 + xfactor5;

		int yfactor2 = factor(y, 2);
		int yfactor5 = factor(y, 5);
		int totaly = yfactor2 + yfactor5;

		if (totalx < totaly) {
			return x;

		} else {
			return y;
		}

	}

	public int factor(int x, int factor) {

		int count = 0;

		while (x > 0 && x % factor == 0) {
			count++;
			x = x / factor;

		}

		return count;

	}

	public static void main(String[] args) {

		Alextreasue2 tr = new Alextreasue2();

		int n = 3;
		int[][] tiles = { { 2, 3, 10 }, { 5, 10, 3 }, { 4, 2, 5 } };

		int solve = tr.solve(n, tiles);
		System.out.println(solve);
		// TODO Auto-generated method stub

	}

}
