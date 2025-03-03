package com.example.demo.test5;

import java.util.ArrayList;
import java.util.HashMap;

public class duplicateList {

	public void duplicates() {

		ArrayList<String> list = new ArrayList<>();

		list.add("g");
		list.add("s");
		list.add("g");

		list.add("r");

		HashMap<String, Integer> hashMap = new HashMap<>();

		for (String str : list) {

			Integer default1 = hashMap.getOrDefault(str, 0);

			hashMap.put(str, default1 + 1);

//			Integer integer = hashMap.get(str);
//			if (integer == null) {
//				hashMap.put(str, 1);
//
//			} else {
//				hashMap.put(str, integer + 1);
//
//			}

		}

		System.out.println(hashMap);

	}

	public static void main(String[] args) {

		duplicateList duplicateList = new duplicateList();
		duplicateList.duplicates();

		// TODO Auto-generated method stub

	}

}
