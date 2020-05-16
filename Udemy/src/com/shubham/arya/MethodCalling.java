package com.shubham.arya;

public class MethodCalling {

	public void planet() {
		multiplicationTable(6);
		System.out.println("this is method belogs to method calling class");
	}

	public void multiplicationTable(int j) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d =%d", i, j, i * j).println();

		}
	}
}
