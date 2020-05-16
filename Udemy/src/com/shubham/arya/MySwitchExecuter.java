package com.shubham.arya;

public class MySwitchExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySwitch ch = new MySwitch();
		ch.isWeekday(6);
		determineNameOfTheMonth(11);
		determineNameOfDay(7);
		int i = 6;
		int even = (i % 2 == 0 ? 2 : 32);
		System.out.println(even);
	}

	/*
	 * static boolean isWeekday(int dayNumber) {
	 *
	 * switch (dayNumber) { case 0: System.out.println("weekday"); break; case 1:
	 * System.out.println("weekday"); break; case 2: System.out.println("weekday");
	 * break; case 3: System.out.println("weekday"); break; case 4:
	 * System.out.println("weekday"); break; case 5: System.out.println("weekend");
	 * break; case 6: System.out.println("weekend"); break; default:
	 * System.out.println("please provide valid input"); break;
	 *
	 * } return false;
	 *
	 * }
	 */

	public static String determineNameOfTheMonth(int monthNumber) {

		switch (monthNumber) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Feburay");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
		default:
			System.out.println("please provide valid input");
			break;
		}
		return null;

	}

	static boolean determineNameOfDay(int dayNumber) {

		switch (dayNumber) {
		case 7:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thur");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		default:
			System.out.println("please provide valid input");
			break;

		}
		return false;

	}

}
