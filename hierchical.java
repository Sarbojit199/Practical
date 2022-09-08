class Vehicle{
	void running() {
		System.out.println(" i am Running ");
	}
}
class car3 extends Vehicle{
	void run() {
		System.out.println("Car run mode on");
	}
}
class Bike1 extends Vehicle{
	void speed() {
	System.out.println("Speed is high");
}}
public class hierchical {
	public static void main(String[] args) {
	Bike1 obj =new Bike1();			//cannot call the car1 class from these object creation
	obj.running();
	obj.speed();	
	
	
	//created another object to call car1 class
	car3 obj1= new car3();
	obj1.run();
	obj1.running();
	}
}
