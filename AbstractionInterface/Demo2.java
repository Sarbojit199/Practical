package innovation.com.shapes;
//achieve multiple inheritance using interface
public interface Demo2 {		//first interface
void show();
}
interface Demo3{			//second interface
	void print();
}
class example implements Demo2,Demo3{ 
	public void show() {
		
		System.out.println("show");
	}
	public void print() {
		System.out.println("print");
	}
	public static void main(String[] args) {
		example obj =new example();
		obj.show();
		obj.print();
	}
}
