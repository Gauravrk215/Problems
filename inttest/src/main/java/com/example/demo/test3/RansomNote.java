package com.example.demo.test3;

public class RansomNote {

	public static boolean canConstruct(String ransomNote, String magazine) {

		int rlength = ransomNote.length();
		if (rlength>magazine.length() ) {
			return false;

		}

		for (int i = 0; i < rlength; i++) {

			char charAt = ransomNote.charAt(i);
			char charAt2 = magazine.charAt(i);
			if (charAt != charAt2) {
				return false;

			}

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean canConstruct1 = canConstruct("aa", "aab");
		System.out.println(canConstruct1);

		boolean canConstruct = canConstruct("a", "b");
		System.out.println(canConstruct);

	}

}
