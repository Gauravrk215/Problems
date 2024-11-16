package com.example.demo.test3;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {

		String string = String.valueOf(x);

		int length = string.length();

		int l = length / 2;

		for (int i = 0; i < l; i++) {

			char charAt = string.charAt(i);
			char charAt2 = string.charAt(length-1);

			if (charAt != charAt2) {
				return false;
			}
			length--;

		}
		return true;

	}

	public static void main(String[] args) {

		PalindromeNumber number = new PalindromeNumber();
		
		
		boolean palidrom1 = number.isPalindrome(1233421);
		System.out.println(palidrom1);
		
		boolean palindrome = number.isPalindrome(12321);
		System.out.println(palindrome);
	}
	
	
	

}
