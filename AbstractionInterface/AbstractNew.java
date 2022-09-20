package Interfacabstract;

public abstract  class AbstractNew {
	AbstractNew(){
		System.out.println("constructor");
	}
	abstract void show();
	void method1() {
		System.out.println("method 1 created");
	}}
 class Anything extends AbstractNew{
	 public void show() {
		 System.out.println("method running success");
	 }
 
	public static void main(String[] args) {
		Anything obj =new Anything();
		obj.method1();
		obj.show();
		

	}

}
