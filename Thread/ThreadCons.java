package Thread;
//using thread class
/*public class ThreadCons {

	public static void main(String[] args) {
		Thread obj=new Thread("sarbojit");	//using the constructor thread( String name)
		obj.start();		//moves to active state
		String str =obj.getName();		//thread name by invoking get name method
		System.out.println(str);

	}
}*/

//runnable interface
public class ThreadCons implements Runnable {
		public void run() {
			System.out.println("thread activated");
		}
	public static void main(String[] args) {
		
		Runnable r =new ThreadCons();
		Thread obj=new Thread(r,"sarbojit");	//using the constructor thread( String name)
		obj.start();		//moves to active state
		String str =obj.getName();		//thread name by invoking get name method
		System.out.println(str);

	}
}




