/* example- Multi Catch block of java */
package com.cognizant.tax;

public class MultiCatch {
	static void mFunc() {
		try {
			int i=50/0;
			int arr[] =new int[3];
			arr[4]=24;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {		
			System.out.println(e);
		}
		catch(ArithmeticException e) {		//whatever the error that exception in try will be called first
			System.out.println(e);
		}
		
		finally {
			System.out.println("final block will execute");
		}
	}
	public static void main(String[] args) {
		mFunc();

	}

}
