package com.generics.com;

import java.math.BigDecimal;

public class GenericsExecuter {

	static <X> X doublevalue(X value) {
		return value;
	}

	public static void main(String[] args) {

		doublevalue(new BigDecimal(1));

		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Arya");
		list.addElement("Shubham");
		String value = list.get(0);

		System.out.println(list);
		System.out.println(value);
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(7));
		list2.addElement(Integer.valueOf(420));
		Integer value1 = list2.get(0);
		System.out.println(list2);
		System.out.println(value1);

	}

}
