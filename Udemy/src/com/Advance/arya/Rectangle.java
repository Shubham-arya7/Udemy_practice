package com.Advance.arya;

public class Rectangle {

	// state
	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	private int width;

	// constructor
	Rectangle(int lenght, int width) {
		this.length = lenght;
		this.width = width;

	}

	// Behavior
	public int addLength(int add) {
		int newLength = (length + add);
		this.length = newLength;
		return length;
	}

	public int addWidth(int add) {
		int newWidth = (width + add);
		this.width = newWidth;
		return width;
	}

	public int areaRec() {

		int area = getLength() * getWidth();

		return area;
	}

	@Override
	public String toString() {

		return String.format("length - %d , width - %d ,area - %d", length, width, areaRec());

	}
}
