package com.shubham.arya;

import java.math.BigDecimal;

public class SimpleIntrest {

	BigDecimal Principal;
	BigDecimal Interest;
	// private String Number1;
	// private String Number2;

	public SimpleIntrest(String Principal, String Interest) {
		this.Principal = new BigDecimal(Principal);
		this.Interest = new BigDecimal(Interest).divide(new BigDecimal(100));

	}

	public BigDecimal calculateTotalValue(int NoOfYear) {

		// String Number6 = Integer.toString(Number3);
		// BigDecimal Number4 = new BigDecimal(Number1);
		// BigDecimal Number5 = new BigDecimal(Number2);
		// BigDecimal Number7 = new BigDecimal(Number6);
		// BigDecimal Number9 = new BigDecimal(100);

		BigDecimal totalValue = Principal.add(Principal.multiply(Interest).multiply(new BigDecimal(NoOfYear)));
		return totalValue;

	}

}
