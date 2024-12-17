package com.example.demo.test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {

	public static void common1() {

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);

		// Clone list1 to avoid modifying original list
		ArrayList<Integer> commonList = new ArrayList<>(list1);
		commonList.retainAll(list2);

		System.out.println("Common elements: " + commonList);
	}

	public static void common2() {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

		List<Integer> commonList = list1.stream().filter(list2::contains).collect(Collectors.toList());

		System.out.println("Common elements: " + commonList);
	}

	public static void main(String[] args) {

		common2();
	}
}
