package com.example.demo.test2;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

	
	  public List<String> fullJustify(String[] words, int maxWidth) {
	        List<String> result = new ArrayList<>();
	        int i = 0;
	        
	        while (i < words.length) {
	            int lineLength = words[i].length();
	            int j = i + 1;
	            
	            // Determine the last word that fits in the current line
	            while (j < words.length && lineLength + words[j].length() + (j - i) <= maxWidth) {
	                lineLength += words[j].length();
	                j++;
	            }
	            
	            int numWordsInLine = j - i;
	            int numSpaces = maxWidth - lineLength;
	            
	            // Build the line
	            StringBuilder line = new StringBuilder();
	            
	            if (j == words.length || numWordsInLine == 1) {
	                // Left-justified (last line or only one word in the line)
	                for (int k = i; k < j; k++) {
	                    line.append(words[k]);
	                    if (k < j - 1) line.append(" ");
	                }
	                // Add remaining spaces to the end
	                int remainingSpaces = maxWidth - line.length();
	                for (int s = 0; s < remainingSpaces; s++) {
	                    line.append(" ");
	                }
	            } else {
	                // Fully justified line
	                int spacesBetweenWords = numSpaces / (numWordsInLine - 1);
	                int extraSpaces = numSpaces % (numWordsInLine - 1);
	                
	                for (int k = i; k < j; k++) {
	                    line.append(words[k]);
	                    if (k < j - 1) {
	                        for (int s = 0; s < spacesBetweenWords; s++) {
	                            line.append(" ");
	                        }
	                        if (extraSpaces > 0) {
	                            line.append(" ");
	                            extraSpaces--;
	                        }
	                    }
	                }
	            }
	            
	            result.add(line.toString());
	            i = j;
	        }
	        
	        return result;
	    }
}
