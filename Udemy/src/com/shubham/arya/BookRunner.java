package com.shubham.arya;

public class BookRunner {

	public static void main(String[] args) {

		Book artOfProgramming = new Book(1000);
		Book effectiveJava = new Book();
		Book cleanCode = new Book(300);

		System.out.println(artOfProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());

		artOfProgramming.Author("Art of Programming", 220);
		effectiveJava.Author("Effective code", 320);
		cleanCode.Author("clean code ", 420);

		artOfProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(200);

		artOfProgramming.increaseCopies(50);
		effectiveJava.increaseCopies(50);

		artOfProgramming.DecreaseCopies(50);
		effectiveJava.DecreaseCopies(350);

		System.out.println(artOfProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());

		int a = Integer.BYTES;
		System.out.println(a);
	}

}