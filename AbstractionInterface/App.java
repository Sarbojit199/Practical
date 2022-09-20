package Interfacabstract;

interface Abc {
void print();		//abstract1

void display();
//no need to define method
default void show() {	//default 1
	System.out.println("hi");
}
static void hello() {		//static method
	System.out.println("inside static method");
}

}
public class App implements Abc{
	public void print() {		//implement all the interface method
		System.out.println("in print method");
	}
	public void display() {
		System.out.println("in display method");
	}
	
	
	public static void main(String[] args) {
		App a =new App();
		a.show();
		a.print();
		a.display();
		Abc.hello();		//calling static method from interface
	}
}
