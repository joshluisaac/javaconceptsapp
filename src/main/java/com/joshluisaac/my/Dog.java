package com.joshluisaac.my;

public class Dog {

	String breed;
	int age;
	String colour;

	public static void main(String args[]) {
      barking();
      hungry();
      sleeping();
	}

	private static void barking() {
		System.out.println("Call to barking() is initiated");

	}

	private static void hungry() {
		System.out.println("Call to hungry() is initiated");
	}

	private static void sleeping() {
		System.out.println("Call to sleeping() is initiated");
	}
}
