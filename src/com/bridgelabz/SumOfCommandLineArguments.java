/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class SumOfCommandLineArguments {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z,sum;
		int count = 0;
		 Scanner sc = new Scanner(System.in);  
	        System.out.print("Enter first number x: ");  
	        x = sc.nextInt();  
	        System.out.println("Enter second number y: ");             
	        y = sc.nextInt();
	        System.out.println("Enter second number z: ");             
	        z = sc.nextInt();
	        sum = x+y+z;
			System.out.println("sum of command-line arguments is : " +sum);
	/*if(sum<0 && sum>0) {
		System.out.println("valid" );
	}*/
			  /*for (count = 0; sum != 0; sum /= 10, ++count) {
			    }*/

			while (sum != 0) {
			      // sum = sum/10
			      sum /= 10;
			      ++count;
			    }

			    System.out.println("Number of digits: " + count);
			  }
			
}