package com.example.demo.test3;

public class maxDistance {

	public static int maxDistance(String s, char x) {

		if (s.isEmpty()) {
			return -1;

		}

		String string = s.replaceAll(" ", "");
		int indexOf = string.indexOf(x);
		int lastIndexOf = string.lastIndexOf(x);

		int out = lastIndexOf - indexOf-1;

		return out;

		// code here
	}

	public static void main(String[] args) {

		int maxDistance = maxDistance("i love gfg", 'g');
		System.out.println(maxDistance);

	}

}
