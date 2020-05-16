package com.Advance.arya;

public class WeekExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] week = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		Week week1 = new Week(week);
		String data = Week.getLongestWeek();
		System.out.println(data);
		week1.getWeekBackward();

	}

}
