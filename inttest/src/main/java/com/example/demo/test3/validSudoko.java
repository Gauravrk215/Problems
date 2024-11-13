package com.example.demo.test3;

import java.util.HashSet;

public class validSudoko {

	public boolean isValidSudoku(char[][] board) {
        // Arrays of HashSet to track seen numbers in rows, columns, and boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Traverse each cell in the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];

                // Skip empty cells
                if (num == '.') {
                    continue;
                }

                // Calculate box index
                int boxIndex = (i / 3) * 3 + (j / 3);

                // Check if the number already exists in the row, column, or box
                if (rows[i].contains(num) || cols[j].contains(num) || boxes[boxIndex].contains(num)) {
                    return false;
                }

                // Add the number to the respective sets
                rows[i].add(num);
                cols[j].add(num);
                boxes[boxIndex].add(num);
            }
        }

        return true; // No conflicts found
    }

}
