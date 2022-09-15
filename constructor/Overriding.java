package classandobj;
//creating parent class
public class Overriding {
void run() {
	System.out.println("running mode ");
}
}
//creating child class
class testoveriding extends Overriding{
	//defining same name method as its decleration in parent class
	void run() {
		System.out.println("run override");
	}
	public static void main(String[] args) {
		
		testoveriding obj = new testoveriding();
		obj.run();
	}
}
