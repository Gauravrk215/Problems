package com.example.demo.test2;

public class TwoSumIIInputArrayIsSorted {

//	step 1 in for loop minus ith number from target
//	stepn 2 find that number on that array
//	if got then record that index either go next

	public int[] twoSum(int[] numbers, int target) {

		int[] arr = new int[2];
		for (int i = 0; i < numbers.length; i++) {

			int k = numbers[i];
			int j = target - k;
			for (int j2 = i + 1; j2 < numbers.length; j2++) {
				if (j == numbers[j2]) {

					arr[0] = i + 1;
					arr[1] = j2 + 1;
				}

			}

		}
		return arr;

	}
	
//	 got time limit exceed error better for small array

	public static void main(String[] args) {

		TwoSumIIInputArrayIsSorted sorted = new TwoSumIIInputArrayIsSorted();

		int[] twoSum1 = sorted.twoSum(new int[] { 5, 25, 75 }, 100);
		System.out.println(twoSum1);

		int[] twoSum = sorted.twoSum(new int[] { 2, 7, 11, 15 }, 9);
		System.out.println(twoSum);
	}

}
