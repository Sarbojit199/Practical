  class access{
	  int age;
	  String name;
	  
	
  }
public class objref {
	public static void main(String[] args) {
		access obj=new access();
		access obj1=new access();
		access obj2=new access();
		obj.age=20;
		obj.name="Sarbojit";			//set the value
		obj1.age=28;					//set the value
		obj1.name="Dev";
		obj2.age=34;
		obj2.name="my";
		System.out.println(obj.age+" "+obj.name);			
		System.out.println(obj1.age+" "+obj1.name);
		System.out.println(obj2.age+" "+obj2.name);
	}
}

