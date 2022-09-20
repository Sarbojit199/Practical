/*Example-Abstraction*/ 
package Interfacabstract;

public abstract class Abstracton {
	
	abstract void method();		//declaring abstract method 
}
class Test extends Abstracton{
	void method() {		//implement the abstract method
		System.out.println("run method");
		
	}

class NewTest extends Abstracton{
	void method() {					//override the abstract method
		System.out.println("method running success");
	}

	public static void main(String[] args) {
	 Abstracton abs= new Test();
abs.method();
	}
}

	

}
