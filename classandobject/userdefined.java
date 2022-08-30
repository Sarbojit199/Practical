package Java;
import java.util.Scanner;
public class userdefined {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();			//taking input from the user
		checkEvenOdd(num);				//calling the meathod defined later
	}
		public static void checkEvenOdd(int num) {					//method
			if(num%2==0) {					//check if number is even
				System.out.println("The entered number is even");
			}
			else {					//check if the number is even
				System.out.println("The entered number is odd");
			}
		}
	
	
}
