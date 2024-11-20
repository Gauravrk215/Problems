package com.example.demo.test2;

import java.util.HashMap;

public class RomanToInt {

	public int romanToInt(String s) {

		int out = 0;

		int length = s.length();

		HashMap<Character, Integer> map = new HashMap<>();

		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		for (int i = 0; i < length; i++) {

			char chr = s.charAt(i);

			Integer cvalue = map.get(chr);

			if (i < length - 1 && cvalue < map.get(s.charAt(i + 1))) {
				out -= cvalue;
			} else {

				out += cvalue;
			}

		}

		return out;

	}

	public static void main(String[] args) {

		RomanToInt data = new RomanToInt();
		int test1 = data.romanToInt("DCXXI");
		System.out.println(test1);

		int test2 = data.romanToInt("IV");
		System.out.println(test2);

	}

}
