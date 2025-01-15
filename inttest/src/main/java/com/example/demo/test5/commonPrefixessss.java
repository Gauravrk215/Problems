package com.example.demo.test5;

import java.util.ArrayList;
import java.util.List;

public class commonPrefixessss {

	public List<Integer> common(List<String> str) {

		ArrayList<Integer> list = new ArrayList<>();
		if (str.isEmpty()) {
			return list;

		}

		list.add(0);
		String prefix = "";

		for (int i = 1; i < str.size(); i++) {
			
			int l=0;

			String string = str.get(i);
			String string2 = str.get(i - 1);

			for (int j = 0; j < string.length(); j++) {

				char charAt = string.charAt(j);
				char charAt2 = string2.charAt(j);

				if (charAt == charAt2) {
					prefix = prefix + charAt;
					l++;

				}

			}
			list.add(l);

		}
		return list;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}

}
