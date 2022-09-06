
//static applied to manage our memory as a keyword, variable, method
//static variable-allocate memory only one time

//Copy constructor-we are creating the copy constructor
public class copy {
	
	int age;
	String name ;
	copy(int a, String n){
		age=a;
		name =n;
		
	}
	copy(){
		
	}
	void show() {
		System.out.println(+age+" "+name);
	}
	public static void main(String[] args) {
		copy obj =new copy(23, "Sarbojit");
		copy obj1 =new copy();
		obj1.age= obj.age;			//copying the age from obj to obj1
		obj1.name= obj.name;		//copying the name
		
		obj.show();			//output= 23 Sarbojit 
		obj1.show();//copy all values of obj to obj1 then it produce output otherwise null
		//output =23 Sarbojit
	}

}
