package Array;

import java.util.Scanner;

public class ArrayColour {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of colours: ");  
		//reading the number of elements from the that we want to enter  
		int n=sc.nextInt();  
	 
		String[] array = new String[n];  
		System.out.println("Enter the "+n+" elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
			System.out.print("please enter "+(i+1)+ "element of the array ");
		array[i]=sc.next();  
		
		} 
		System.out.print("The colours of the array is:   "); 
		for(int j=0;j<n;j++) 
		
			
			System.out.print(array[j] +" "); 
		
	  

	}

}
