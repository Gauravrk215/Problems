package com.example.demo.test2;

public class ReverseWordsinaString {

	public String reverseWords(String s) {

		String str = "";
		if (s.isEmpty()) {
			return str;

		}

		String[] split = s.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			str = str.trim() + " " + split[i].trim();

		}

		return str.trim();

	}

	public static void main(String[] args) {

		ReverseWordsinaString data = new ReverseWordsinaString();

		String reverseWords = data.reverseWords("the sky is blue");

		System.out.println(reverseWords);

		String reverseWords2 = data.reverseWords("example   good a");

		System.out.println(reverseWords2);
	}

}
