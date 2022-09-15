package com.cognizant.shapes;
/* by has-a method*/

 class Operation {
	int square(int n){  
		  return n*n;  	//squaring the values
		 }  
		}  
		  
		class Circle{  
		 Operation op;//aggregation  
		 double pi=3.14;  
		    
		 double area(int radius){  
		   op=new Operation();  
		   int rsquare=op.square(radius);  
		   return pi*rsquare;  	//return the value after calculating
		 }  
		  
		     
		    
		 public static void main(String args[]){  
		   Circle c=new Circle(); 	//creating object of circle 
		   double result=c.area(5);  	//store value in  variable returning from circle area
		   System.out.println(result);  
		 }  
		}  
		
	
	

	

 
 
 

