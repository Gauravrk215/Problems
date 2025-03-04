package com.example.demo.test5;

public class test67 {

	public boolean check() {

		int[] arr = { 1, 5, 8, 3, 4 };

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i+1]) {

				return false;

			}

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test67 t = new test67();
		boolean check = t.check();
		System.out.println(check);

	}

}
