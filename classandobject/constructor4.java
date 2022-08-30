package classandobj;

public class constructor4 {
	int age;
	String name;
	void show() {
		System.out.print(+age+ " " +name);
	}
	

	public static void main(String[] args) {
		constructor4 obj =new constructor4();		//default constructor is called so gives default value
		obj.show();
	}
}
