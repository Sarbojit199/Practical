/* Super constructor */
class Shap{
	String name="circle";
	void print() {
		System.out.println("print circle");
	}
}
class size extends Shap{
	String name ="triangle";	//data member of child method
			

void displayName() {
	System.out.println(name);
	System.out.println(super.name);		//calling the super constructor of parent class
}

void print() {
System.out.println("print triangle");
super.print();			//calling the super constructor
}
}
public class Shape {
	

		public char[] name;

		public static void main(String[] args) {
			size obj= new size();
			obj.displayName();
			obj.print();
			
			//output-  
		/*	triangle
		 * circle
		 * print triangle
		 * print circle */
		 
}}
