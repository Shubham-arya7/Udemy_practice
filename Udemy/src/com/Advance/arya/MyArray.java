package com.Advance.arya;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {

		int[] marks = { 22, 100, 298 };
		int sum = 0;
		for (int marking : marks) {
			sum = sum + marking;
			System.out.print("\t" + sum);
		}

		int[] mark2 = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < mark2.length; i++) {
			System.out.println("\n" + mark2[i]);
		}

		int[] mark3 = new int[5];

		System.out.println(Arrays.toString(mark3));

		mark3[4] = 40;
		System.out.println(Arrays.toString(mark3));
	}

}
