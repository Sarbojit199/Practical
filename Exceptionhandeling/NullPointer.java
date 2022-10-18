/* Null Pointer exception */
package com.cognizant.tax;

public class NullPointer {
int a=10;
public static NullPointer ram() {
	return null;
}
String str=null;
int arr[] =null;
String convert (String s) {
	return s.toUpperCase();
}
	public static void main(String[] args) {
		NullPointer obj =new NullPointer();
		System.out.println(obj.convert(null));
		System.out.println(obj.arr.length);
		System.out.println(obj.str.equals("sarbojit"));
		// TODO Auto-generated method stub

	}

}
