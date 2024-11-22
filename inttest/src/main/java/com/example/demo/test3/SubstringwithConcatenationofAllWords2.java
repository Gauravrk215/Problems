package com.example.demo.test3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringwithConcatenationofAllWords2 {

	public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result; // Agar input invalid hai, toh empty list return karo
        }

        int wordLength = words[0].length(); // Har word ki length
        int wordCount = words.length; // Words ka total count
        int totalLength = wordLength * wordCount; // Total length of concatenated substring

        // Step 1: Frequency Map banao for words
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Step 2: Sliding window ke through process karo
        for (int i = 0; i <= s.length() - totalLength; i++) {
            // Current substring nikaalo
            String substring = s.substring(i, i + totalLength);

            // Helper function se check karo ki substring valid hai ya nahi
            if (isValidSubstring(substring, wordLength, wordCountMap)) {
                result.add(i); // Agar valid hai, toh starting index result mein add karo
            }
        }

        return result;
    }

    // Helper function to validate substring
    private boolean isValidSubstring(String substring, int wordLength, Map<String, Integer> wordCountMap) {
        Map<String, Integer> seen = new HashMap<>();

        // Substring ko `wordLength` ke chunks mein todh kar process karo
        for (int j = 0; j < substring.length(); j += wordLength) {
            String word = substring.substring(j, j + wordLength); // Current word nikaalo

            if (!wordCountMap.containsKey(word)) {
                return false; // Agar word `words` mein nahi hai, toh invalid substring
            }

            // Seen map update karo
            seen.put(word, seen.getOrDefault(word, 0) + 1);

            // Agar word ka count `wordCountMap` se zyada ho gaya, toh invalid
            if (seen.get(word) > wordCountMap.get(word)) {
                return false;
            }
        }

        return true; // Agar sab match hota hai, toh valid substring hai
    }

    public static void main(String[] args) {
    	SubstringwithConcatenationofAllWords2 solution = new SubstringwithConcatenationofAllWords2();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        System.out.println(solution.findSubstring(s, words)); // Output: [0, 9]
    }
}