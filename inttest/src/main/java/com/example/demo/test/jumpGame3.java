package com.example.demo.test;

public class jumpGame3 {

	 public int jump(int[] nums) {
	        int jumps = 0;         // Jump counter
	        int maxReach = 0;      // Maximum reach with current jumps
	        int nextReach = 0;     // Farthest reach with one more jump

	        for (int i = 0; i < nums.length - 1; i++) {
	            nextReach = Math.max(nextReach, i + nums[i]);

	            // If we've reached the farthest we can go with the current jumps
	            if (i == maxReach) {
	                jumps++;             // Increase the jump count
	                maxReach = nextReach; // Update maxReach for the next jump

	                // Early exit if we can reach or exceed the last index
	                if (maxReach >= nums.length - 1) {
	                    return jumps;
	                }
	            }
	        }

	        return jumps; // Final jump count to reach the last index
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		jumpGame3 game = new jumpGame3();
		int canJump = game.jump(new int[] { 2, 3, 1, 1, 4 });
		System.out.println(canJump);

		int canJump2 = game.jump(new int[] { 2, 3, 0, 1, 4 });
		System.out.println(canJump2);

		int canJump3 = game.jump(new int[] { 0 });
		System.out.println(canJump3);

		int canJump4 = game.jump(new int[] { 1 });
		System.out.println(canJump4);

		int canJump5 = game.jump(new int[] { 0, 2, 3 });
		System.out.println(canJump5);
	}

}
