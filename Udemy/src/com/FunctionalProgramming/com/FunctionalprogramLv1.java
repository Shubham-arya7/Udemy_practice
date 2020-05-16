package com.FunctionalProgramming.com;

import java.util.List;
import java.util.function.Consumer;

class BeyondForEach implements Consumer<String> {

	@Override
	public void accept(String t) {
		// TODO Auto-generated method s

		System.out.print(t + " ");

	}

}

public class FunctionalprogramLv1 {

	public static void main(String[] args) {
		List<String> str2 = List.of("Apple", "Ant", "Bat");
		List<Integer> srt6 = List.of(1, 3, 45, 66, 545234);

		str2.stream().map(element -> element.toLowerCase()).forEach(element -> System.out.print(element + " "));

		System.out.println("");

		str2.stream().map(element1 -> element1.length()).forEach(element1 -> System.out.print(element1 + " "));

		str2.stream().forEach(new BeyondForEach());

	}

}
