class Rectangle{
	public static void main(String[] args){
	System.out.println("Enter two numbers:");            
	int length = 10;                                               // initialize length
	int breadth = 5;                                               // initialize breadth

	System.out.println(length+" "+breadth);
	int perimeter = (2*(length+breadth));                          // logic for perimeter
	int area = length*breadth;                                     // logic for area
	System.out.println("The perimeter of rectangle is:=" +perimeter);  // output logic
	System.out.println("The area of rectangle is:=" +area);            // output logic
}
}