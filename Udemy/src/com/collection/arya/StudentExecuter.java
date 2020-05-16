package com.collection.arya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentExecuter {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(2, "Arya"), new Student(30, "Divyansh"),
				new Student(20, "Kulkarni"));

		ArrayList<Student> studentAL = new ArrayList<>(students);
		System.out.println(studentAL);
		Collections.sort(studentAL);

		System.out.println(studentAL);

	}

}
