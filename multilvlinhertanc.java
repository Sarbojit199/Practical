class vehicle2{
	void running() {
		System.out.println("running");
	}
}
class car1 extends vehicle2{
	void run() {
		System.out.println("running");
	}
}
class bike extends car1{
	void speed() {
		System.out.println("speed high");
	}
}



public class multilvlinhertanc {
	public static void main(String[] args) {
	      bike d= new bike();			//create object of last classs
	      d.running();
	      d.run();
	      d.speed();
	    
}}
