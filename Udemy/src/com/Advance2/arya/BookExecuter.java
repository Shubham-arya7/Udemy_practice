package com.Advance2.arya;

public class BookExecuter {

	public static void main(String[] args) {

		Book book = new Book(420, "My Java", "Arya");

		book.addReview(new Review(10, "best one", 5));

		book.addReview(new Review(11, "best one1", 4));

		System.out.println(book);
	}

}
