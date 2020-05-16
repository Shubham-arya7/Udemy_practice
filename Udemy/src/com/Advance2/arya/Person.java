package com.Advance2.arya;

public class Person {

	private String Name;
	private String Address;
	private int Contact;

	Person() {
		// this.Address = Address;
		// this.Name = Name;
		// this.Contact = Contact;
	}

	public String getName() {
		return Name;
	}

	public String getAddress() {
		return Address;
	}

	public int getContact() {
		return Contact;
	}

	public void setName(String name) {

		Name = name;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void setContact(int contact) {
		Contact = contact;
	}
}
