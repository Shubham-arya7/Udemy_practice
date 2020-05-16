package com.Advance.arya;

import java.time.LocalDate;
import java.time.LocalTime;

public class MyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date1 = LocalDate.now();
		System.out.println(date1);

		LocalTime date2 = LocalTime.now();
		System.out.println(date2);

		LocalDate date3 = LocalDate.of(2007, 1, 01);
		System.out.println(date3);
		LocalDate date5 = date3.plusYears(100);
		System.out.println(date5);
	}

}

/*
 * import java.util.Calendar; import java.util.Date; import
 * java.util.GregorianCalendar;
 *
 * public class MyDate { public static void main(String[] argv) throws Exception
 * {
 *
 * Calendar xmas = new GregorianCalendar(1998, Calendar.DECEMBER, 25); Date
 * date1 = xmas.getTime();
 *
 * System.out.println(date1); }
 *
 * }
 */
