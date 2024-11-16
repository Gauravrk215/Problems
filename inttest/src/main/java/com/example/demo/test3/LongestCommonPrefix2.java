package com.example.demo.test3;

public class LongestCommonPrefix2 {

	public String longestCommonPrefix(String[] strs) {

		if (strs.length == 1) {

			return strs[0];
		}

		String first = strs[0];

		String prefix = "";

		for (int i = 1; i < strs.length; i++) {
			prefix = "";

			String string = strs[i];

			int length = string.length();

			int firstlength = first.length();
			int min = Math.min(firstlength, length);

			for (int j = 0; j < min; j++) {

				char charAt = string.charAt(j);
				char charAt2 = first.charAt(j);
				if (charAt == charAt2) {
					prefix = prefix + charAt;

				} else {
					break;
				}

			}
			first = prefix;

		}
		return prefix;

	}

	public static void main(String[] args) {

		LongestCommonPrefix2 prefix = new LongestCommonPrefix2();

		String string1 = prefix.longestCommonPrefix(new String[] { "cir", "car" });
		System.out.println(string1);
		String string = prefix.longestCommonPrefix(new String[] { "flower", "flow", "flight" });
		System.out.println(string);

		// TODO Auto-generated method stub

	}

}
