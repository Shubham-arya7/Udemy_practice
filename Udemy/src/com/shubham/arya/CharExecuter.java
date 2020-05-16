package com.shubham.arya;

public class CharExecuter {

	public static void main(String[] args) {

		Char myChar = new Char('D');

		System.out.println(myChar.isVowel());

		System.out.println(myChar.isConsonent());

		System.out.println(myChar.isNumber());

		System.out.println(myChar.isAlphabet());

		myChar.printLowerCaseAlphabet();
		myChar.printUpperCaseAlphabet();
	}

}
