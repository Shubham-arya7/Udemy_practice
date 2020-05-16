package com.Advance.arya;

public class MyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String s = "This is a lot of text again";
		// String k = "HelLo";
		// String l = "hello";
		/*
		 * s.length(); for (int i = 0; i < s.length(); i++) {
		 *
		 * System.out.println(s.charAt(i)); }
		 */

		/*
		 * part 1 System.out.println(s.indexOf("o")); System.out.println(s.charAt(11));
		 * System.out.println(s.lastIndexOf("k")); System.out.println(s.charAt(14));
		 * System.out.println(s.startsWith("This"));
		 * System.out.println(s.contains("text"));
		 * System.out.println(s.endsWith("again"));
		 * System.out.println(s.startsWith("xsasjch;as"));
		 * System.out.println(s.isEmpty()); System.out.println(k.isEmpty());
		 * System.out.println(s.equals(k)); System.out.println(l.equalsIgnoreCase(k));
		 */

		/*
		 * String str = s.concat("but its fine"); System.out.println(str); String U =
		 * str.toUpperCase(); String str4 = str.concat(" for me");
		 * System.out.println(str4); String m1 = String.join(",", U, k);
		 * System.out.println(m1); String srt1 = str.toUpperCase();
		 * System.out.println(srt1); String srt2 = str4.trim();
		 * System.out.println(srt2);
		 *
		 * String m = String.join(",", srt1, srt2); System.out.println(m);
		 */

		@SuppressWarnings("deprecation")
		Integer int1 = new Integer(6);
		System.out.println(int1);
		@SuppressWarnings("deprecation")
		Integer int3 = new Integer("6");
		System.out.println(int3);
		Integer int2 = Integer.valueOf("3");

		System.out.println(int2);
		Integer int4 = Integer.valueOf(3);

		System.out.println(int4);

	}
}
