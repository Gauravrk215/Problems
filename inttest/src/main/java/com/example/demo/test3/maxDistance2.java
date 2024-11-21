package com.example.demo.test3;

import java.util.HashSet;

public class maxDistance2 {

	public static int maxDistance(String s, char X) {

		// Edge case: If X does not exist or occurs only once
		if (s == null || s.length() == 0 || s.indexOf(X) == -1 || s.indexOf(X) == s.lastIndexOf(X)) {
			return -1;
		}

		// List to store indices of occurrences of X
		int[] indices = new int[s.length()];
		int indexCount = 0;

		// Collect all occurrences of X in the string
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == X) {
				indices[indexCount++] = i;
			}
		}

		int maxDistance = -1;

		// Iterate over all pairs of occurrences of X
		for (int i = 0; i < indexCount - 1; i++) {
			for (int j = i + 1; j < indexCount; j++) {
				int start = indices[i];
				int end = indices[j];

				// Use a HashSet to track distinct characters between start and end
				HashSet<Character> distinctChars = new HashSet<>();

				// Iterate through the characters between the two occurrences of X
				for (int k = start + 1; k < end; k++) {
					char c = s.charAt(k);
					if (c != ' ' && c != X && !Character.isWhitespace(c)) {
						distinctChars.add(c);
					}
				}

				// Update the maximum distinct character count
				maxDistance = Math.max(maxDistance, distinctChars.size());
			}
		}

		return maxDistance;
		// code here
	}

	public static void main(String[] args) {

		String s = "m a v jm r iu r y ikwyp qdg x g xque ivnyzs nv jx zz p bzl k og lnh imj qb ra";
		char X = 'x';

		int result = maxDistance(s, X);
		System.out.println(result);

		int maxDistance = maxDistance("i love gfg", 'g');
		System.out.println(maxDistance);

	}

}
