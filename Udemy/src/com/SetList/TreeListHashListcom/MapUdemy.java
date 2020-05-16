package com.SetList.TreeListHashListcom;

import java.util.HashMap;
import java.util.Map;

public class MapUdemy {

	public static void main(String[] args) {

		String str = "This is a awesome thing . " + "This thing  has never happend before.";

		Map<Character, Integer> occur = new HashMap<>();

		char[] chr = str.toCharArray();
		for (char cr : chr) {
			Integer integer = occur.get(cr);
			if (integer == null) {
				occur.put(cr, 1);

			} else {
				occur.put(cr, integer + 1);
			}

		}
		System.out.println(occur);

		Map<String, Integer> occur1 = new HashMap<>();

		String[] str1 = str.split(" ");

		for (String str2 : str1) {
			Integer integer = occur1.get(str2);
			if (integer == null) {
				occur1.put(str2, 1);

			} else {
				occur1.put(str2, integer + 1);
			}

		}
		System.out.println(occur1);
	}
}
