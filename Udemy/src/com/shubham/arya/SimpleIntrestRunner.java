package com.shubham.arya;

import java.math.BigDecimal;

public class SimpleIntrestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleIntrest calculator = new SimpleIntrest("4500", "7.5");

		BigDecimal totalValue = calculator.calculateTotalValue(5);

		System.out.println(totalValue);

	}

}
