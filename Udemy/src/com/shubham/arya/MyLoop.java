package com.shubham.arya;

public class MyLoop {

	private int i;

	public MyLoop(int i) {

		this.i = i;

	}

	public boolean isPrime() {
		// this.i = i;
		if (i % 2 == 0 & !(i == 2)) {
			System.out.println(false);
			return false;
		}
		System.out.println(true);
		return true;

	}

	public int sumUptoN() {
		// this.i = i;
		int sum = 0;
		for (int j = 0; j <= this.i; j++) {
			// System.out.print(i + " ");
			sum = sum + j;
		}
		// System.out.println("=" + (this.i * (this.i + 1)) / 2);
		return sum;

	}

	public int sumOfDivisors() {
		int sum = 0;
		for (int i = 2; i < this.i; i++) {
			if (this.i % i == 0) {
				sum = sum + i;
			}
		}

		return sum;
	}

	public void printANumberTriangle() {

		for (int k = 1; k <= 5; k++) {
			for (int j = 1; j <= k; j++) {
				System.out.print(j + " ");
			}

			{
				System.out.println("");
			}
		}
	}
}
