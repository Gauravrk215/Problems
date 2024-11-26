package com.example.demo.test3;

import java.util.HashMap;

public class IsomorphicStrings {

	public static boolean isIsomorphic(String s, String t) {

		int slength = s.length();
		int tlength = t.length();

		boolean out = true;

		HashMap<Character, Character> hashMap = new HashMap<>();

		for (int i = 0; i < slength; i++) {

			char charAt = s.charAt(i);
			char charAt2 = t.charAt(i);

			Character character = hashMap.get(charAt);
			boolean containsValue = hashMap.containsValue(charAt2);
			boolean containsValue1 = hashMap.containsValue(charAt);

			if (character == null && !containsValue && !containsValue1) {
				hashMap.put(charAt, charAt2);

			} else {

				if (containsValue && character == null

				) {
					out = false;

					break;
				} else if (character != charAt2) {
					out = false;

					break;
				}

			}

		}
		return out;
	}

	public static void main(String[] args) {

		boolean isomorphic2 = isIsomorphic("badc", "baba");
		System.out.println(isomorphic2);

		boolean isomorphic1 = isIsomorphic("foo", "bar");
		System.out.println(isomorphic1);
		boolean isomorphic = isIsomorphic("egg", "add");
		System.out.println(isomorphic);

	}

}
