/**
 * 
 */
package com.joshluisaac.my;

/**
 * @author joshua
 * 
 */
public class Puppy {

	private int  puppyAge;

	public Puppy(java.lang.String name) {
		// TODO Auto-generated constructor stub
		// This constructor has one parameter, name.
		System.out.println("Passed Name is :" + name);
	}

	// set the puppy's age first
	public void setAge(int age) {
		puppyAge = age;
	}

	// get the puppy's age
	public int getAge() {
		System.out.println("Puppy's age is :" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Following statement would create an object myPuppy
		/* Object creation */
		Puppy myPuppy = new Puppy("tommy");
		
		/* Call class method to set puppy's age */
		myPuppy.setAge(3);
		
		/* Call another class method to get puppy's age */
		myPuppy.getAge();
		
		/* You can access instance variable as follows as well */
		System.out.println("Variable Value :" + myPuppy.puppyAge);

	}

}
