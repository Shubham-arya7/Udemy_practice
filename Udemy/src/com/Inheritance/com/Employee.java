package com.Inheritance.com;

import java.math.BigDecimal;

public class Employee extends Person {

	private String title;

	private String employerName;

	private String employeeGrade;

	private BigDecimal salary;

	Employee() {
		// this.title = title;
		// this.employerName = employerName;
		// this.employeeGrade = employeeGrade;
		// this.salary = salary;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n title :" + title + "\n EmployeeGrade : " + employeeGrade + "\n EmployerName :" + employerName
				+ "\n Salary :" + salary + "\n Person name:" + getName() + "\n phone :" + getPhone() + "\n Email : "
				+ getEmail();

	}
}
