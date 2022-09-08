import java.util.Scanner;
public class Area {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the radius:");
	float area = scanner.nextFloat();
	Circlee obj=new Circlee(area);
	
}
}
