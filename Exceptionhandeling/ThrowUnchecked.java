//exxample of throw unchecked-runtime exception
package com.cognizant.tax;

public class ThrowUnchecked {
		public static void elligible(int age) {
			if(age<18) {
				throw new ArithmeticException("u are not elligible of vote");
			}
			else {
				System.out.println("persone ligible for vote");
			}
		}
	public static void main(String[] args) {
		elligible(12);
		System.out.println("done");

	}

}
