package com.example.demo.test4;

import java.util.HashMap;

public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
		if (pattern.length() != words.length) {
			return false; // If lengths mismatch, it's not a match
		}

		// Maps to track character-to-word and word-to-character mappings
		HashMap<Character, String> charToWord = new HashMap<>();
		HashMap<String, Character> wordToChar = new HashMap<>();

		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			String word = words[i];

			// Check character-to-word mapping
			if (charToWord.containsKey(c)) {
				if (!charToWord.get(c).equals(word)) {
					return false; // Mismatch in mapping
				}
			} else {
				charToWord.put(c, word);
			}

			// Check word-to-character mapping
			if (wordToChar.containsKey(word)) {
				if (wordToChar.get(word) != c) {
					return false; // Mismatch in reverse mapping
				}
			} else {
				wordToChar.put(word, c);
			}
		}

		return true; // All checks passed
	}

	public static void main(String[] args) {
		WordPattern solution = new WordPattern();

		// Example 1
		System.out.println(solution.wordPattern("abba", "dog cat cat dog")); // Output: true

		// Example 2
		System.out.println(solution.wordPattern("abba", "dog cat cat fish")); // Output: false

		// Example 3
		System.out.println(solution.wordPattern("aaaa", "dog dog dog dog")); // Output: true

		// Example 4
		System.out.println(solution.wordPattern("abba", "dog dog dog dog")); // Output: false
	}
}