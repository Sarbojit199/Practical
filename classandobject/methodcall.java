class mn{
	int date, age;
	String name;
	void meathod(int d, int a, String n) {
		date =d;
		age=a;
		name=n;
	}
	void display() {
		System.out.println(date+ " " +age +" " +name);
	}
}
public class methodcall {
	public static void main(String ... args) {
		mn  obj=new mn();
		obj.meathod(10, 34, null);
		obj.display();
	}
}
