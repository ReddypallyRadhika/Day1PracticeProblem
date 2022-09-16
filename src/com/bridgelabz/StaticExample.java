/**
 * 
 */
package com.bridgelabz;

/**
 * @author hp
 *
 */
public class StaticExample {

	/**
	 * @param args
	 */
	static int a = 3;// static variable
	  static int b;

	    // Declaration of a static method
	  static void math(int x) {
	    System.out.println("x = " + x);
	    System.out.println("a = " + a);
	    System.out.println("b = " + b);
	  }
	   
	  static {
		//static block
	    System.out.println("Static block initialized.");
	    b = a * 4;
	  }
	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample.math(6);// Calling static method.

	}

}
