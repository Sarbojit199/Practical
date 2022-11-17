/* Array list example */


package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayList {
	public static void main(String[] args) {
		List a1=new ArrayList();					//creating array list object
		List<String> all = new ArrayList<String>();
		//add element
		all.add("rose");						
		all.add("sunflower");
		all.add("marie");
		all.add("gold");
		all.add("jasmine");
		all.add("orchid");
		all.add("lotus");
	//	System.out.print("get the element" +all.get(1));
		all.set(1, "me");		//removing the first index element
		for(String flower:all) {
			System.out.print(flower+" , ");
		}
		System.out.println("/n"+all.get(2));
		
				List<Integer> al2 = new ArrayList<Integer>();
				al2.add(5);
				al2.add(8);
				al2.add(9);
				al2.add(1, 15);
			//	Collections.sort(al2);				//sort the arraylist
				
				for(Integer Number:al2)
					System.out.print(" "+Number);
				
	}
	

}
