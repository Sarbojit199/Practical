class Calculation{
	public static void main(String[] args){
	System.out.println("enter two numbers:");
	int a=10;                                                //initialize 1st local variable
	int b=5;                                                 // initialize 2nd local variable
	System.out.println(a +" "+ b);
	int sum = a+b;                                           //addition of both numbers
	
	System.out.println("The sum of two numbers is:=" +sum);

	// System.out.println(a -" "- b);
	int sub = a-b;                                           //subtraction of both numbers
	System.out.println("The subtraction of two number is:=" +sub);
	
	int multiplication = a*b;                                // multiplication of both number
	System.out.println("The multiplication of two number is:=" +multiplication);

	int division = a/b;                                      //division of both number
	System.out.println("The division of two number is:=" +division);
	}
}