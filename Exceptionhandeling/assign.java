/* you have given a two integer x and y as a input  you have to compute x/y if x and y are not 32 bit signed
 * integer or y is 0 exception will occur and you  have to report it .Read sample input and output to what to report 
 */
package com.cognizant.tax;

import java.util.Scanner;

public class assign {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
		
		System.out.println("Enter two integer");
		try {
			int x= s.nextInt();
			int y=s.nextInt();
			System.out.println(" "+(x/y));
		}
		catch(Exception e) {
			System.out.println("you have not entered a integer");
			System.out.println(e);
		}

	}

}
