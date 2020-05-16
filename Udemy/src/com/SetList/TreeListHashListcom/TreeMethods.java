package com.SetList.TreeListHashListcom;

import java.util.Set;
import java.util.TreeSet;

public class TreeMethods {

	public static void main(String[] args) {

		TreeSet<Integer> num = new TreeSet<>(Set.of(65, 54, 34, 12, 99));
		// num.floor(30);
		System.out.println(num.floor(34));
		System.out.println(num.lower(34));
		System.out.println(num.ceiling(34));
		System.out.println(num.higher(34));
		System.out.println(num.subSet(40, 100));
		System.out.println(num.headSet(70));
		System.out.println(num.tailSet(70));

	}

}
