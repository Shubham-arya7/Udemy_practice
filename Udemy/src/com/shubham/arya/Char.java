package com.shubham.arya;

public class Char {

	private char value;

	Char(char value) {
		this.value = value;
	}

	public boolean isVowel() {

		if (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'A' || value == 'E'
				|| value == 'I' || value == 'O' || value == 'U') {
			return true;

		}
		return false;
	}

	public boolean isConsonent()

	{
		if (isVowel() == false && isNumber() == false) {
			return true;
		}
		return false;

	}

	public boolean isNumber() {

		if (value >= 48 && value <= 57) // & (isAlphabet() == false && isVowel() == false && isConsonent() == false)
		{
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {

		// if (isVowel() == true && isConsonent() == true && isNumber() == false) {
		if (value >= 65 && value <= 90 || value >= 97 && value <= 122) {
			return true;
		}

		return false;

	}

	public void printLowerCaseAlphabet() {
		// this.value = value;
		if (value >= 97 && value <= 122) {
			for (value = 97; value <= 122; value++) {
				System.out.print(value);
			}
		}

	}

	public void printUpperCaseAlphabet() {
		this.value = value;
		if (value >= 65 && value <= 90) {
			for (value = value; value <= 90; value++) {
				System.out.print(value);
			}
		}

	}
}