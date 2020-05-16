package com.Advance.arya;

public class Week {
	private static String[] week;

	public Week(String[] week) {
		Week.week = week;
	}

	// TODO Auto-generated constructor stub
	public static String getLongestWeek() {

		String data = null;
		int len = Integer.MIN_VALUE;

		for (String name : week) {
			int len1 = name.length();
			if (len1 > len) {
				len = len1;
				data = name;
			}

		}

		return data;

	}

	public void getWeekBackward() {
		for (int i = week.length - 1; i > 0; i--)

		{
			System.out.println(week[i]);
		}

	}
}
