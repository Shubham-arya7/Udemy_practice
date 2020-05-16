package com.Advance2.arya;

public class CoustomerExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeaddress = new Address("Arya", "kelvingrove", "m23201");
		Address workaddress = new Address("Mr.Arya", "New Ontario", "M1M2M3");

		Customer customer = new Customer("Arya", homeaddress);
		customer.setWorkaddress(workaddress);
		System.out.println(customer);

	}
}
