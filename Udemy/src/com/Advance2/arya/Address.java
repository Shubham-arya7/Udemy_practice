package com.Advance2.arya;

public class Address {

	private String AddrLine1;
	private String City;
	private String zipcode;

	public Address(String addrLine1, String city, String zipcode) {
		super();
		this.AddrLine1 = addrLine1;
		this.City = city;
		this.zipcode = zipcode;

	}

	@Override
	public String toString() {
		return AddrLine1 + City + zipcode;
	}
}
