package com.example.demo.test;

public class jumpGame {

	public boolean canJump(int[] nums) {

		boolean isJump = false;
		int length = nums.length;
		
		if (length==1) {
			return true;
		}

		for (int i = 0; i < length-1; i++) {
			int j = nums[i];
			int k = i + j;

			if (k >= length-1) {
				isJump = true;
				break;

			}

		}
		return isJump;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		jumpGame game = new jumpGame();
		boolean canJump = game.canJump(new int[] { 3, 2, 1, 0, 4 });
		System.out.println(canJump);
		
		boolean canJump2 = game.canJump(new int[] { 2,3,1,1,4});
		System.out.println(canJump2);
		
		boolean canJump3 = game.canJump(new int[] { 0});
		System.out.println(canJump3);

		boolean canJump4 = game.canJump(new int[] { 1 });
		System.out.println(canJump4);// failed at this return true but yah false aa rha hai

		boolean canJump5 = game.canJump(new int[] { 0,2,3});
		System.out.println(canJump5);
	}

}
