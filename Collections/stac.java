/* Stack Example */

package Collections;

import java.util.Stack;

public class stac {
	public static void main(String[] args) {
		
	
	Stack<Integer> st= new Stack<>();		//create stack object		
	st.push(4);								//push into stack
	st.push(3);
	System.out.println("stack element " +st);
	Integer digit = st.peek();						//access element from the top of the stack
	System.out.println("top element "  +digit);
	//search any element
	
	 int p = st.pop();						//remove top element
	 System.out.println("the deleted element  " +p);
	 
	 System.out.println("slack element " +st);
	 
	 Boolean b= st.isEmpty();								//check if stack is empty or not
	 System.out.println("stack is empty "+b);
	}
}
