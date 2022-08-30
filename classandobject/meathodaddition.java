package Java;

import java.util.Scanner;



public class meathodaddition {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number    ");
	int num1 = sc.nextInt();
	System.out.print("Enter the secondnumber    ");
	int num2 = sc.nextInt();
	
	System.out.println("The addition of two numbers are"   +addition(num1,num2));//calling the meathod and whatever the meathod return will be ans
	
	}
	static int addition(int n1,int n2) {
		int add=n1+n2;		 //add two number
		return add;			//return from where it is called
	}
	
	
}
