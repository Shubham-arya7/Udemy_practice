package com.shubham.arya;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		int number = 0;

		int sum = 0;
		do {
			if (number > 0) {
				System.out.println("sum =" + (number * number * number));
			}

			System.out.println("Enter Number");
			number = sc.nextInt();

		}

		while (sum < 0);

		System.out.println("Thank you");

		sc.close();
	}
}
