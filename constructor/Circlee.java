import java.util.Scanner;

public class Circlee {

	private float radius;
	static float pi=3.14F;
	public Circlee() {  			//default constructor
		radius =1.5F;
	}
	Circlee(float radius){			//cons-2
		//this(10.5F,3.5F);			//we call the cons3 from  cons2
		this.radius = radius;
	}
	public Circlee(float radius, float pi) {		//cons-3
													//cons chining using cons2
		this.radius =radius;
	}
	static float calculateCircumference(float radius) {		
		 return 2*pi*radius;
			
		}
		 static float  calculateArea(float radius) {
			return  pi*radius*radius;
			
		}
	public static void main(String[] args) {
		//Circlee obj =new Circlee();
		//Scanner scanner =new Scanner(System.in);
		//System.out.println("Enter the radius:");
		//float radius = scanner.nextFloat();
		System.out.println("The circumference of the circle is:" +calculateArea(2.1f));
		System.out.println("The area of the circle is:" +calculateCircumference(1.2f));
	}
	
	
	
}
