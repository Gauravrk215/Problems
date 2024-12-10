package com.example.demo.test4;
import java.util.HashSet;

public class ContainsDuplicate3 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	
        HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If the current number is already in the set, we found a duplicate
            if (set1.contains(nums[i])) {
                return true;
            }

            // Add the current number to the set
            set1.add(nums[i]);

            // Remove the oldest number if the size exceeds k
            if (set1.size() > k) {
                set1.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
    	
    	
        ContainsDuplicate3 solution = new ContainsDuplicate3();

        // Test cases
        System.out.println(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)); // Output: true
        System.out.println(solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1)); // Output: true
        System.out.println(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)); // Output: false
    }
}
