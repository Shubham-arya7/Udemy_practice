package com.Syncronized.concurrency;

public class ConcurrencyExecuter {

	public static void main(String[] args) {
		Counter cr = new Counter();

		cr.increamentI();
		cr.increamentJ();

		System.out.print(cr.getI() + "\n ");
		System.out.print(cr.getJ());

	}

}
