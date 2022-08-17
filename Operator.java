
public class Operator {

	public static void main(String[] args) {
		
		System.out.println("Hello to the coding World with Sarbojit ");
		int a= 10;
		int b= 20;
		
		/*Different types of operator*/
		
		/*Arithmetic operator, logical operator, relational operator, unary operator*/
		
		/*Arithmetic operator*/

		System.out.println(a+b);   	        //ans=30             
		System.out.println(a-b);   	        //ans= -10
		System.out.println(a*b);	        //ans=200
		System.out.println(b/a);	        //ans=2
		System.out.println(a%b);	         //ans=10
		System.out.println(10*5/3+2-1*6/3);  //ans=16
		
		/*Logical operator  && relational operator*/

		System.out.println(a<b&&b<a);     //false       true && false =false because && operator both true then output true
		System.out.println(a<b || b<a);   //true        true||false =true if any one true result is true
		System.out.println(a>=b);	      //false	 	 a is not greater than b
		System.out.println(a<=b); 	      //true   	     a is less than b
		System.out.println(a==b);	      //false        a is not equals b
		System.out.println(a>b);	      //false         a is not greater than b
		System.out.println(a<b);          //true          a is lesser than b
		System.out.println(a!=b);         //true          a not equals b
		


		boolean success = false;
		System.out.println(success);           //false       
		System.out.println(!success);	       //true

		/*Unary operator  */
		
		System.out.println(a++);	         //output = 10 
		System.out.println(++a);	         //output= 12
		System.out.println(a--);	        //output= 12
		System.out.println(--a);        	//output= 10

		
		/*updated values of a and b are a=10 b=20*/
		
		System.out.println(a);		       //output a=10    
		System.out.println(b);		       //output b=20

		int c = a++ + ++a;
		
		System.out.println(c);             //ans= 22 
		


	}

}
