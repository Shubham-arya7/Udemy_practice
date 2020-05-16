package com.Execeptionalhandling.udemy;

class Amount {

	private String currency;

	private int amount;

	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;

	}

	public void add(Amount that) {

		if (!this.currency.equals(that.currency)) {
			throw new RuntimeException("Currency voilation error");
		}

		this.amount = this.amount + that.amount;

	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

public class ExceptionalhandlingLevel1 {

	public static void main(String[] args) {

		Amount amount1 = new Amount("USD", 100);
		Amount amount2 = new Amount("USD", 100);

		amount1.add(amount2);
		System.out.println(amount1);

	}

}
