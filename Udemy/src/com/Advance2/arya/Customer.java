package com.Advance2.arya;

public class Customer {
	// state
	private String name;
	private Address Homeaddress;

	private Address Workaddress;

	// contructor
	Customer(String name, Address Homeaddress) {
		this.name = name;
		this.Homeaddress = Homeaddress;

	}

	public Address getWorkaddress() {
		return Workaddress;
	}

	public void setWorkaddress(Address workaddress) {
		Workaddress = workaddress;
	}

	public Address getHomeaddress() {
		return Homeaddress;
	}

	public void setHomeaddress(Address homeaddress) {
		Homeaddress = homeaddress;
	}

	@Override
	public String toString() {
		return name + Homeaddress + Workaddress;
	}
}
