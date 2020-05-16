package com.shubham.arya;

public class BiNumber {

	private int Number1, Number2;

	public int getNumber1() {
		return Number1;
	}

	public void setNumber1(int number1) {
		Number1 = number1;
	}

	public int getNumber2() {
		return Number2;
	}

	public void setNumber2(int number2) {
		Number2 = number2;
	}

	BiNumber(int Number1, int Number2) {
		this.Number1 = Number1;
		this.Number2 = Number2;

	}

	public int add() {

		return Number1 + Number2;

	}

	public int multiply() {

		return Number1 * Number2;

	}

	public void doubleValue() {
		this.Number1 = this.Number1 * this.Number1;
		this.Number2 = this.Number2 * this.Number2;

		// this.Number1*=2;
		// this.Number2*=2;
	}

}
