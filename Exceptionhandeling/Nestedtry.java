/* Example of nested try catch block */

package com.cognizant.tax;

public class Nestedtry {
	
	public static void main(String[] args) {
	try {		//outer try block
		try {		//inner try block
			System.out.println("going to divide by 0");
			int b=19/0;
			
		}catch(ArithmeticException e) {			//catch block of inner
			System.out.println(e);		
		}
			try {		//inner try block 2
				int a[]= new int[5];
				a[6]=4;
				
			}
			catch(ArrayIndexOutOfBoundsException e){		//catch block of outer try block
				System.out.println(e);}
				System.out.println("other statement");
			}
			catch(Exception e) {
				System.out.println("handle the exception");
			}
			System.out.println("normal flow..");
		
			


	}

}
