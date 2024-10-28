package com.example.demo.test;

import java.util.Arrays;

public class h_index {

	
	
//	Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.
//
//			According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.
//	
	
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
