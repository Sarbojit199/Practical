package Array;
/*wajp to print second smallest number in java*/
public class secondsmallest {

	public static void main(String[] args) {
		int arr[] = {3,3,4,2,5,5};
		
		
		int first=arr[0]; int second =arr[0];
		for(int i=0;i<arr.length;i++ ) {
			if(arr[i]<first) {
				first=arr[i];
			}
			if( arr[i]<second && arr[i]>first) {
				second=arr[i];
			}
			}
			System.out.print("  The second smallest element is  "+second);
		

	}

}
