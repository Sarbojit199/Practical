package com.cognizant.tax;
 class UserDefinedExceptionnn extends Exception{
	
public UserDefinedExceptionnn(String str) {
	super(str);
}}
public class UserDefined{
	public static void main(String[] args) {
		{try {
			throw new UserDefinedExceptionnn("user defined exception");
		}
		catch
			(UserDefinedExceptionnn u){
				System.out.println("exception dhora poreche");
				System.out.println(u.getMessage());
			}
		}

	}

}
