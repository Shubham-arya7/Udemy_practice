package com.FunctionalProgramming.com;

import java.util.List;

public class FunctionalProgrm_method_refrencing {

	public static void main(String[] args) {
		Integer max = List.of(23, 45, 67, 34).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2))
				.get();

		System.out.println(max);

		Integer max1 = List.of(23, 45, 67, 34, 42, 64).stream().filter(FunctionalProgrm_method_refrencing::isEven)
				.max(Integer::compare).orElse(0);
		System.out.println(max1);

	}

	public static boolean isEven(Integer number) {
		return number % 5 == 0;

	}

}