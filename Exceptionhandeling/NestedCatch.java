/* Example- Nested Catch */
package com.cognizant.tax;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedCatch {

	public static void main(String[] args) {
		// input mismatch
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		try {
			int x= s.nextInt();
			int y=s.nextInt();
			System.out.println(" "+(x/y));
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		catch(Exception e) {	//other than input mismatch everyone will come here
			System.out.println(e);
		}

	}

}
