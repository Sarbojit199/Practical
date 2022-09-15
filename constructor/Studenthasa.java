package com.cognizant.shapes;

public class Studenthasa {
public int id;
public String name;
 Addresshasa Address;
public Studenthasa(int id, String name, Addresshasa Address) {
	super();
	this.id = id;
	this.name = name;
	this.Address = Address;
}
void show() {
System.out.println(id+ " "+ name);
System.out.println(Address.city + " "+Address.state+" "+Address.country);
}
public static void main(String ...args) {
	Addresshasa ad =new Addresshasa("DGP", "Wb" , "india");
	Studenthasa md = new Studenthasa(23, "sarbojit", ad);
	md.show();
	
}
 
}
