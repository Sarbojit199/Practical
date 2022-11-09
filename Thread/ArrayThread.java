package Thread;

import java.util.ArrayList;

class MyThread1 extends Thread {
	public void run() {
		ArrayList<String> book =new ArrayList<String>();
		book.add("think and grow rich");
		book.add("how to win");
		book.add("the power of possitive thinking");
		book.add("7 habits of highly effective people");
		System.out.println(book);
	}
}
public class ArrayThread {
	public static void main(String[] args) {
		MyThread1 obj1 = new MyThread1();
		obj1.start();
		
	}

}
