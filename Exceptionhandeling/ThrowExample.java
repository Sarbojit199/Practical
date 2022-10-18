package com.cognizant.tax;
//unchecked exception
public class ThrowExample {
		//throw use-if my code having error or not decide at compile time
	//exception throw explicitly 
	public static void myDisplay(int a) throws ArithmeticException{
		if(a>=0 && a<=35) {
			throw new ArithmeticException("value cannot be less than 35");
		}
		else {
			System.out.println("you are pass");
		}
	}
	public static void main(String[] args) {
		myDisplay(20);

	}

}
