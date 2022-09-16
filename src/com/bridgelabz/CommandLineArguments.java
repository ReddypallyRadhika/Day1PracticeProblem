/**
 * 
 */
package com.bridgelabz;
import java.util.*;

/**
 * @author hp
 *
 */
class CommandLineArguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Printing the first argument
       // System.out.println(args[0]);
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter your name: ");  
        String name = in.nextLine();  
        System.out.println("Name is: " + name);             
        in.close();

	}

}
