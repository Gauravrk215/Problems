package com.example.demo.test3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringwithConcatenationofAllWords {

	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> result = new ArrayList<>();
		if (s == null || s.isEmpty() || words == null || words.length == 0) {
			return result;
		}

		int wordLength = words[0].length();
		int wordCount = words.length;
		int totalLength = wordLength * wordCount;

		// Map each word to its frequency in words
		Map<String, Integer> wordMap = new HashMap<>();
		for (String word : words) {
			wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
		}

		// Slide over the string with windows of size totalLength
		for (int i = 0; i <= s.length() - totalLength; i++) {
			Map<String, Integer> seenWords = new HashMap<>();
			int j = 0;

			// Check each word in the current window
			while (j < wordCount) {
				int wordStart = i + j * wordLength;
				String currentWord = s.substring(wordStart, wordStart + wordLength);

				// If the word is not in words, break the loop
				if (!wordMap.containsKey(currentWord)) {
					break;
				}

				// Add the word to seenWords map
				seenWords.put(currentWord, seenWords.getOrDefault(currentWord, 0) + 1);

				// If word count in seenWords exceeds the count in wordMap, break
				if (seenWords.get(currentWord) > wordMap.get(currentWord)) {
					break;
				}

				j++;
			}

			// If all words match, add the start index to the result
			if (j == wordCount) {
				result.add(i);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		SubstringwithConcatenationofAllWords solution = new SubstringwithConcatenationofAllWords();
		String s = "barfoothefoobarman";
		String[] words = { "foo", "bar" };
		System.out.println(solution.findSubstring(s, words)); // Output: [0, 9]
	}

}
