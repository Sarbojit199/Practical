package classandobj;

public class parameteriseconstructor {
	int age;
	String name;
 parameteriseconstructor(int a, String n){
	age=a;
	name=n;
}
void show() {
	System.out.println(age+ " "+name);
}
public static void main(String[] args) {
	parameteriseconstructor obj = new parameteriseconstructor(50, "Sarbojit");//paparameterize constructor is called
	obj.show();
	parameteriseconstructor obj1 = new parameteriseconstructor(25, "yoo");
	obj1.show();
}
	
}
