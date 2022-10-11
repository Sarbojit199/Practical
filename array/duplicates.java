package Array;
/* to print the number of duplicate element in an array */
public class duplicates {

	public static void main(String[] args) {
		int arr[] = {3,3,4,2,5};
		
	
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println("The number of duplicates" +arr[i]);
			}

	}}

}
