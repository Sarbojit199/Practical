/*Example Interface*/
package Interfacabstract;

 interface DemoTest {		//interface
	void display();		//method of interface
	

}
class Demo1 implements DemoTest{

	
	public void display() {		//implement interface method
		System.out.println("display");		//it will print
		
	}
	public static void main(String[] args) {
		DemoTest ob= new Demo1();		//we cannot directly make object of interface method
		ob.display();
	}
	
}
