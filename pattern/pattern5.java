package Java;

public class pattern5 {
	public static void main(String[] args) {
	/*	5
	 	54
	 	543
	 	5432
	 	54321		*/ 	
		for(int i=5;i>=1;i--) {
			for(int j=5; j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
