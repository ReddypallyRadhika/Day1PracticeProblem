/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class StringEqual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String:");
		String s1 = sc.nextLine();
		//Scanner in1 = new Scanner(System.in);
		System.out.println("Enter second String:");
		String s2 = sc.nextLine();
		/*if (s1 == s2)
		{
		System.out.println("s1 is equal to s2");
		}
		else
		{
			System.out.println("s1 is not equal to s2");
		
	}*/
		if (s1.equals(s2) == true)
		{
			System.out.println("s1 is equal to s2");
			}
			else
			{
				System.out.println("s1 is not equal to s2");
			
		}
}
}
