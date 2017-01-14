/**
 * Cracking-The-Coding-Interview
 * Problem_01.java
 */
package com.deepak.ctci.Ch13_Java;

/**
 * <br> Problem Statement:
 * 
 * In terms to Inheritance, what is the effect of keeping a constructor private?
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/* In java, when a class is defined it gets a default public constructor.
	 * When we talk about inheritance, it allows us to use the properties and methods
	 * of the other class. The class which is using the properties and method is
	 * called a sub class whereas the class which actually owns those properties and methods
	 * is called a super class. 
	 * For this particular problem, when a constructor is declared as private, 
	 * it can be accessed by all those classes which can access the private methods
	 * of the that class. Moreover, a private constructor will not allow the class to
	 * be instantiated */

	private static Problem_01 obj = null;

	/**
	 * Private Constructor
	 */
	private Problem_01() {}

	/**
	 * Method to make sure only one instance is created
	 * @return {@link Problem_01}
	 */
	public static Problem_01 objectCreationMethod(){
		/* This logic will ensure that no more than one object can be created at a time */
		if(obj == null){
			obj = new Problem_01();
		}
		return obj;
	}

	/**
	 * Method to display a message
	 */
	public void display(){
		System.out.println("Singleton class Example");
	}

	/**
	 * Main method to test the execution of program
	 * No unit tests needed
	 * @param args
	 */
	public static void main(String[] args) {
		/* Creating singleton instance of the class because object cannot
		 * be created due to the existence of private constructor.
		 * You can instantiate the class here because this main method
		 * is inside the Problem_01 class and private methods can be 
		 * accessed within the class. */
		Problem_01 singeltonClass = Problem_01.objectCreationMethod();
		singeltonClass.display();
	}

}
