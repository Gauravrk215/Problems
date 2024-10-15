package com.example.demo.test;

import java.util.Arrays;

public class h_index {

	
	public int hIndex(int[] citations) {
        // Sort citations in descending order
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i; // Remaining papers count
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }
}
