/*  Arraylist compare */

package Collections;

import java.util.ArrayList;
import java.util.List;

public class compare {
	
	
	
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		//adding to integer 2
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		if(l1.equals(l2)) {
			System.out.println("Array list are equal");
		}
		if(l1.contains(2)) {
			System.out.println("the arraylist contain 2");
		}
		Boolean b=l1.containsAll(l2);				//check if arraylist1 contains all the content of arraylist2
		System.out.println( b+ " the content equal" );
		
		
		
		List<String> l3 = new ArrayList<String>();
		l3.add("sarbo");
		l3.add("priya");
		List<String> l4 = new ArrayList<String>();
		l4.add("sarbo");
		l4.add("priya");
					//check if both the arraylist contain same content
		System.out.println("Yes content are equal  " +(l3.toString().contentEquals(l4.toString())));
		
		
	}

}
