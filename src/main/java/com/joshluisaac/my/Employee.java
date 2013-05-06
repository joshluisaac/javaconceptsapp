package com.joshluisaac.my;

public class Employee {

	String name;
	int age;
	String designation;
	double salary;

	// DEPARTMENT is a constant
	public static final String DEPARTMENT = "Development ";

	public Employee(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/* Print the Employee details */
	public void printEmployee() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Designation:" + designation);
		System.out.println("Salary:" + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Create two objects using constructor */
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Mary Anne");

		// Invoking methods for each object created
		empOne.setAge(26);
		empOne.setDesignation("Senior Software Engineer");
		empOne.setSalary(1000);
		empOne.printEmployee();
		System.out.println("Making Static Reference to a Static variable "  + Employee.DEPARTMENT); //static reference: access to a class (static) variable
		System.out.println("Making Non Static Reference to a Non Static variable "  + empOne.salary); //non static reference: access to an instance (non static) variable
		

		empTwo.setAge(21);
		empTwo.setDesignation("Software Engineer");
		empTwo.setSalary(500);
		empTwo.printEmployee();

	}

}
