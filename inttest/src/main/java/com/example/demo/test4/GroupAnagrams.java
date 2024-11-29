package com.example.demo.test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> list = new ArrayList<>();

		Map<String, List<String>> map = new HashMap<>();

		for (String str : strs) {
			char[] charArray = str.toCharArray();

			Arrays.sort(charArray);

			String string = new String(charArray);

			if (!map.containsKey(string)) {
				map.put(string, new ArrayList<>());

			}

			map.get(string).add(str);

		}
		list.addAll(map.values());
		return list;

	}

	public static void main(String[] args) {

		GroupAnagrams solution = new GroupAnagrams();

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> result = solution.groupAnagrams(strs);

		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
