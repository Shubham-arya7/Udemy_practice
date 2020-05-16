package com.SetList.TreeListHashListcom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MyList {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		System.out.println(characters);

		Set<Character> chr1 = new TreeSet<>(characters);
		System.out.println(chr1);

		Set<Character> chr2 = new HashSet<>(characters);
		System.out.println(chr2);

		ArrayList<Character> chr3 = new ArrayList<>(characters);
		Collections.sort(chr3);
		System.out.println(chr3);

		Set<Character> chr4 = new LinkedHashSet<>(characters);

		System.out.println(chr4);
	}

}
