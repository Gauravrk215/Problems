package com.example.demo.test;

public class jumpGame2 {

//	You are given an integer array nums. 
//	You are initially positioned at the array's first index,
//	and each element in the array represents your maximum jump length at that position.
//  Return true if you can reach the last index, or false otherwise.

	public boolean canJump(int[] nums) {

		int maxReach = 0; // ab tak ka maximum reachable index

		for (int i = 0; i < nums.length; i++) {

			if (i > maxReach) {
				return false;
			}

			maxReach = Math.max(maxReach, i + nums[i]);

			if (maxReach >= nums.length - 1) {
				return true;

			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		jumpGame2 game = new jumpGame2();
		boolean canJump = game.canJump(new int[] { 3, 2, 1, 0, 4 });
		System.out.println(canJump);

		boolean canJump2 = game.canJump(new int[] { 2, 3, 1, 1, 4 });
		System.out.println(canJump2);

		boolean canJump3 = game.canJump(new int[] { 0 });
		System.out.println(canJump3);

		boolean canJump4 = game.canJump(new int[] { 1 });
		System.out.println(canJump4);

		boolean canJump5 = game.canJump(new int[] { 0, 2, 3 });
		System.out.println(canJump5);
	}

}
