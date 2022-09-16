/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class DisplayAMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my first Java Program");
		Scanner in = new Scanner(System.in);  
        System.out.print("Enter your name: ");  
        String name = in.nextLine();  
        System.out.println("Name is: " + name);             
        in.close();

	}

}
