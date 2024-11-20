package com.example.demo.test2;

import java.util.HashMap;

public class IntegerToRoman2 {

	public String intToRoman(int num) {
		Integer out=0;
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "I");
		map.put(5, "V");
		map.put(10, "X");
		map.put(50, "L");
		map.put(100, "C");
		map.put(500, "D");
		map.put(1000, "M");
		
		String string = map.get(1000);
		
		while (num>0) {
			
			
		}
		return null;



	}

	public static void main(String[] args) {

		IntegerToRoman2 data = new IntegerToRoman2();
		String test1 = data.intToRoman(3749);
		System.out.println(test1);

		String test2 = data.intToRoman(58);
		System.out.println(test2);

	}

}
