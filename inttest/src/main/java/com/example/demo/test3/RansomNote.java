package com.example.demo.test3;

import java.util.HashMap;

public class RansomNote {

	public static boolean canConstruct(String ransomNote, String magazine) {

		int rlength = ransomNote.length();
		int mlength = magazine.length();
		if (magazine.length() == 0) {
			return false;

		}
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < mlength; i++) {

			map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
		}

		for (int i = 0; i < rlength; i++) {

			char charAt = ransomNote.charAt(i);

			Integer integer = map.get(charAt);

			if (integer == null || integer == 0) {
				return false;
			} else if (integer >= 1) {

				map.put(charAt, integer - 1);
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		boolean canConstruct2 = canConstruct("a", "b");
//		System.out.println(canConstruct2);
//		
//		boolean canConstruct1 = canConstruct("aab", "baa");
//		System.out.println(canConstruct1);

		boolean canConstruct = canConstruct("aa", "ab");
		System.out.println(canConstruct);

	}

}
