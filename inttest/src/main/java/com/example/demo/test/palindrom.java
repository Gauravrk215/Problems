package com.example.demo.test;

import java.util.ArrayList;

public class palindrom {

	public static boolean palidrom(int num) {

		String str = String.valueOf(num);
		char[] charArray = str.toCharArray();

		int i = 0;

		ArrayList<Integer> list = new ArrayList<>();

		for (char c : charArray) {

			list.add(Integer.valueOf(c));

		}

		boolean isconsistent = true;
		int size = list.size();
		for (int j = size - 1; j >= 0; j--) {

			Integer object = list.get(i);
			Integer object2 = list.get(j);
			if (!object.equals(object2)) {

				isconsistent = false;
				break;
			}
			i++;

		}
		return isconsistent;

	}

	public static boolean palidrom2(int num) {
		boolean isconsistent = true;
		while (num > 0) {

		}

		return isconsistent;

	}

	public static void main(String[] args) {
		boolean palidrom = palidrom(1233421);
		System.out.println(palidrom);

		// TODO Auto-generated method stub

	}

}
