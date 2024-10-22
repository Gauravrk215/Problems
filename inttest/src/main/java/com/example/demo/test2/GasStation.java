package com.example.demo.test2;

public class GasStation {
	
	 public int canCompleteCircuit(int[] gas, int[] cost) {
	        int totalGas = 0;      // Total gas available
	        int totalCost = 0;     // Total gas required
	        int gasBalance = 0;    // Current gas balance
	        int startIndex = 0;    // Potential starting station
	        
	        // Loop through all stations
	        for (int i = 0; i < gas.length; i++) {
	            totalGas += gas[i];
	            totalCost += cost[i];
	            gasBalance += gas[i] - cost[i];
	            
	            // If balance is negative, we cannot start from this station
	            if (gasBalance < 0) {
	                // Reset balance and set next station as the new starting point
	                gasBalance = 0;
	                startIndex = i + 1;
	            }
	        }
	        
	        // If total gas is less than total cost, return -1
	        if (totalGas < totalCost) {
	            return -1;
	        }
	        
	        // Otherwise, return the valid starting index
	        return startIndex;
	    }

}
