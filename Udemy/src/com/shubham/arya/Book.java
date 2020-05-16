package com.shubham.arya;

public class Book {
	private int noOfCopies;// member variables

	Book() {
		this(5);

	}

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() { // method
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {// method
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseCopies(int Copies) {
		setNoOfCopies(noOfCopies + Copies);
	}

	public void DecreaseCopies(int Copies) {
		setNoOfCopies(noOfCopies - Copies);
	}

	public void Author(String name, int noOfCopies) {// method

		{
			if (name == "Art of Programming") {
				System.out.println("this is a " + name + " book " + noOfCopies);

			} else if (name == "Effective code") {
				System.out.println("this is a " + name + " book " + noOfCopies);

			} else {
				System.out.println("this is a " + name + " book " + noOfCopies);
			}
		}
	}

}
