package com.example.demo.test2;

public class LengthofLastWord {

	public int lengthOfLastWord(String s) {

		int output = 0;
		if (s.length() == 0) {
			return output;
		}

		String[] split = s.split(" ");

		String string = split[split.length - 1];
		output = string.length();

		return output;

	}

	public static void main(String[] args) {

		LengthofLastWord data = new LengthofLastWord();
		int word = data.lengthOfLastWord("Hello World");
		System.out.println(word);

	}

}
