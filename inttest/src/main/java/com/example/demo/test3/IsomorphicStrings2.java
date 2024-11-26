package com.example.demo.test3;

import java.util.HashMap;

public class IsomorphicStrings2 {

	public static boolean isIsomorphic(String s, String t) {

		

		boolean out = true;

		HashMap<Character, Character> sToT = new HashMap<>();
		HashMap<Character, Character> tToS = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);

			if (sToT.containsKey(sChar)) {
				if (sToT.get(sChar) != tChar) {
					return false; // Mismatch in mapping
				}
			} else {
				sToT.put(sChar, tChar);
			}

			// Check mapping from t -> s
			if (tToS.containsKey(tChar)) {
				if (tToS.get(tChar) != sChar) {
					return false; // Mismatch in reverse mapping
				}
			} else {
				tToS.put(tChar, sChar);
			}
		}

		return out;
	}

	public static void main(String[] args) {

		boolean isomorphic2 = isIsomorphic("sat", "rpa");
		System.out.println(isomorphic2);

		boolean isomorphic1 = isIsomorphic("foo", "bar");
		System.out.println(isomorphic1);
		boolean isomorphic = isIsomorphic("egg", "add");
		System.out.println(isomorphic);

	}

}
