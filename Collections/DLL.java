/* linked list example */

package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class DLL {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("anudip");			//adding  in l1
		l1.add("Sarbo");
		
		
		l1.add(1, "riya");			//adding these in the first position
		
		LinkedList<String> l2= new LinkedList<String>();
		
		l2.add("aa");				//adding these string in l2
		l2.add("bb");				//adding in l2
		l1.addAll(1,l2);
		
		l1.addFirst("skill");					//adding in first position
		l1.addLast("development");				//adding these in last position
		l1.remove("aa");						//remove these value from l1
		System.out.println(l1);
		
		//traversing the element in the descending order
		
		//for traversing these in reverse order 
		Iterator<String> i= l1.descendingIterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
	}

}
