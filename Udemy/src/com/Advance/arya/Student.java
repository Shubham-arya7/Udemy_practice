package com.Advance.arya;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;

//	private int[] marks;
	ArrayList<Integer> marks = new ArrayList<Integer>();

	Student(String name, int[] marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {

		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getmaximumMark() {
		/*
		 * int maximumMark = 0; for (int mark : marks) { if (mark > maximumMark) {
		 * maximumMark = mark; } } return maximumMark;
		 */

		return Collections.max(marks);
	}

	public int getminimumMark() {

		/*
		 * int minimumMark = Integer.MAX_VALUE; for (int mark : marks) { if (mark <
		 * minimumMark) { minimumMark = mark; } }
		 */
		return Collections.min(marks);

	}

	public BigDecimal getAverageMarks() { // TODO Auto-generated method stub

		int sum = getTotalSumOfMarks();

		// BigDecimal average = new BigDecimal(sum).divide(new
		// BigDecimal(marks.length));

		return new BigDecimal(sum).divide(new BigDecimal(marks.size()), 3, RoundingMode.UP);

	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int i) {

		marks.add(i);
		// TODO Auto-generated method stub

	}

	public void removeMarkAtIndex(int i) {
		marks.remove(i);
		// TODO Auto-generated method stub

	}
}
