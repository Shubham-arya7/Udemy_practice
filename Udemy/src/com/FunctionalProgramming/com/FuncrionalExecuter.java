package com.FunctionalProgramming.com;

import java.util.List;

public class FuncrionalExecuter {

	public static void main(String[] args) {
		List<Integer> list = List.of(101, 120, 201, 220, 301, 320, 401, 420);
		printFP(list);
	}

	public static void printFP(List<Integer> list) {
		// list.stream().filter(element -> element % 2 == 0).forEach(element ->
		// System.out.println(element));

		int sum = list.stream().filter(element -> (element % 2 == 0)).reduce(0,
				(element1, element2) -> element1 + element2);

		System.out.println(sum);

		// IntStream.range(1, 10).reduce(0, (element4, element5) -> element4 + element5)
		// .forEach(element6 -> System.out.println(element6));

	}
}
