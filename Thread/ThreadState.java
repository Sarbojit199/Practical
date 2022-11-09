package Thread;

public class ThreadState extends Thread{

	public void run() {
		System.out.println("thread activated");
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadState obj =new ThreadState();
		obj.start();
		Thread.sleep(5000);

	}

}
