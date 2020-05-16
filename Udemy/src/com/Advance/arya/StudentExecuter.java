package com.Advance.arya;

import java.math.BigDecimal;

public class StudentExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = { 70, 9, 93 };
		Student student = new Student("Arya", marks);
		int number = student.getNumberOfMarks();
		System.out.println("Number of marks: " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("To" + "tal sum of marks:" + sum);
		int maximumMark = student.getmaximumMark();
		System.out.println(" Maximum Marks :" + maximumMark);
		int minimumMark = student.getminimumMark();
		System.out.println(" Minimum Marks :" + minimumMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average marks: " + average);

		System.out.println(student);

		student.addNewMark(35);
		System.out.println(student);

		student.removeMarkAtIndex(2);
		System.out.println(student);

	}

}
