package com.example.demo.test2;

public class ValidPalindrome {

//	step 1 = remove all non alpha numeric
//	step 2 divide its length and find mid value 
//	step 3 compare all its character
	public boolean isPalindrome(String s) {

		boolean ispalid = true;

		String string = s.replaceAll("[^a-zA-Z0-9]", "").replaceAll(" ", "").toLowerCase();

		int length = string.length();
		int num = length / 2;

		for (int i = 0; i <= num - 1; i++) {

			char charAt = string.charAt(i);
			char charAt2 = string.charAt(length - 1);
			if (charAt != charAt2) {
				ispalid = false;

			}
			length--;

		}

		return ispalid;

	}

	public static void main(String[] args) {
		ValidPalindrome palindrome = new ValidPalindrome();

		boolean test = palindrome.isPalindrome("ab_a");
		System.out.println(test);
		boolean test1 = palindrome.isPalindrome("A man, a plan, a canal: Panama");
		System.out.println(test1);

	}

}
