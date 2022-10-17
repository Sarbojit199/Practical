/* Exception handeling concept */
package com.cognizant.tax;

public class ExceptionExample {
	public void show() {
		String a="i am error";
		System.out.println(a);
		try {
			int i=50/0;		//arithmetic exception
			System.out.println(i); 
			String s="riya";
			System.out.println(s.length());
			 int arr[] =new int [3];
			 arr[4]= 24;		//array index outt of bound exception 
			 int m=Integer.parseInt(s);		//number format exception 
			 System.out.println(m);
		}
		catch(Exception e) {
			 System.out.println(e);		//it will print the first exception of try catch block
		}
		String b="i cannot be handled";
		System.out.println(a+ " "+b);		//i am an error + i cannot be handled
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExample ep= new ExceptionExample();
		ep.show();
	}

}
