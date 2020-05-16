package com.shubham.arya;

public class MyLoopExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLoop for1 = new MyLoop(10);

		for1.isPrime();

		System.out.println(for1.sumUptoN());
		System.out.println(for1.sumOfDivisors());
		// for1.sumOfDivisors();

		for1.printANumberTriangle();

	}

}
