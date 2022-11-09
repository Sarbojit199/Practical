package Thread;

public class threadrunnable implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("threads running  " +i);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}}
	public static void main(String [] args) {
		
	threadrunnable t =new threadrunnable();
	Thread t1 =new Thread(t);
	Thread t2 =new Thread(t);
	Thread t3 =new Thread(t);
	Thread t4 =new Thread(t);
	
	
	t1.run();
	t2.run();
	t3.run();
	t4.run();
	}
}
