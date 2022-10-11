package Array;

public class Arraymax {

	public static void main(String[] args) {
		/*int a[] = {10,20,30};
		System.out.println(largest(a));

		}
		public static int largest(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max; */
		
		
		//anonymous array 
		display(new int [] {10,20,30,40,50});} //passing anonymous array
	
		//creating a method which receives  an array as parameter
	
		static void display(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
			
			
	}

}
