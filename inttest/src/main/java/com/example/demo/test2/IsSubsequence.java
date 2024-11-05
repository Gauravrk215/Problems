package com.example.demo.test2;

public class IsSubsequence {

	public boolean isSubsequence(String s, String t) {

		boolean output = true;

		if (s.length() > t.length()) {
			output = false;
		}

		int length = s.length();
		int j = -1;

		for (int i = 0; i < length; i++) {
			char charAt = s.charAt(i);
			int indexOf = t.indexOf(charAt);
			if (indexOf == -1) {
				output = false;
			} else {
				t = t.substring(indexOf+1);
			}

		}

		return output;

	}

	public static void main(String[] args) {

		IsSubsequence subsequence = new IsSubsequence();

		boolean b2 = subsequence.isSubsequence("ab", "baab");
		System.out.println(b2);

		boolean b1 = subsequence.isSubsequence("axc", "ahbgdc");
		System.out.println(b1);

		boolean b = subsequence.isSubsequence("abc", "ahbgdc");
		System.out.println(b);

	}
}
