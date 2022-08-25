package Java;

public class pattern4 {

	public static void main(String [] args) {
		/*
		 1
		 23
		 456
		 789	*/
	
	int k=1;
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i ;j++) {
				if(k<10) {
				System.out.print(k);
				
			}
				k++;
			}
			System.out.println();
		}
		 
	}
}
