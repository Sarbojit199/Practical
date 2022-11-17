/*  Example- vector */

package Collections;

import java.util.Vector;

public class vectr {
	
	public static void main(String[] args) {
		
		Vector<String> vc= new Vector<>();			///creating vector object
		vc.add("dog");								//add into the vector
		vc.add("cat");
		vc.add(0,"tiger");
		System.out.println("size "+vc.size());
		System.out.println("capacity "+vc.capacity());
		vc.addElement("cow");
		vc.addElement("goat");
		System.out.println("after adding the size and capacity");
		System.out.println("size "+vc.size());				//print the size 
		System.out.println("capacity "+vc.capacity());
		
		if(vc.contains("cat")) {
			System.out.println("element present");
		}
		
		System.out.println(vc);
	}

}
