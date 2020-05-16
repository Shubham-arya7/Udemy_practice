package com.Advance2.arya;

public class Review {
	private int id;
	private String description;
	private int rating;

	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return id + " " + description + " " + rating;
		// return String.format("id= %d description= %s rating= %d " + id, description,
		// rating);
	}
}
