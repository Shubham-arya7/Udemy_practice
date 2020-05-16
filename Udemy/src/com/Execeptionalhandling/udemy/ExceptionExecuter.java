package com.Execeptionalhandling.udemy;

public class ExceptionExecuter {

	public static void main(String[] args) {
		method2();
		System.out.println("main ends");

	}

	private static void method1() {
		try {
			String str = null;

			int length = str.length();

			System.out.println(length);
			System.out.println("method1 ends");
		} catch (NullPointerException er) {
			System.out.println("you cannot mesausre length of null String");
			er.printStackTrace();
		} catch (Exception er) {
			System.out.println("This may be other excepton");
			er.printStackTrace();
		}

	}

	private static void method2() {
		method1();
		System.out.println("method2 ends");
	}

}
