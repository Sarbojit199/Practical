package com.innovation.shapes;
// inheritance
public class inheritanvehicle {			//parent class A
void running() {
	System.out.println("running mode on");
}}
class Bike extends inheritanvehicle{		//parent class B
	void run() {
		System.out.println("bike run mode on");
	}
	
		public static void main(String[] args) {	
			Bike d=new Bike();			//if we dont use inhertance then we cannot call both class from single object
			d.run();				//child class meathod
			d.running();
		
		}

}
