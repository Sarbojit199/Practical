package Thread;

public class Threadsss extends Thread{
public void run() {
	while(true) {
	System.out.println("my thread is running");
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
}}

public static void main(String[] args) {
	Threadsss t1= new Threadsss();
	t1.start();
}
}
