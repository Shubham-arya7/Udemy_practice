package com.shubham.arya;

public class WhileNumberPlayer {
	private int Limit = 30;
	// int number = 0;
	// private int i;

	public WhileNumberPlayer(int i) {
		// this.i = i;

		// TODO Auto-generated constructor stub
	}

	public void printSquareUptoLimit(int i) {
		int sum = 0;
		int j = i;

		while (sum < Limit) {

			sum = j * j;
			if (sum < 30) {
				System.out.print(sum + " ");
			}
			j++;
		}
		System.out.println("");
	}

	public void printCubrUptoLimit(int i) {
		int sum = 0;
		int k = i;
		while (sum < Limit) {

			sum = k * k * k;
			if (sum < 30) {
				System.out.print(sum + " ");
			}
			k++;
		}
		System.out.println("");
	}

}
