

package javak;

import java.io.ByteArrayInputStream;

public class ByteArray_Ip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		byte[] b = {66,68,67,90};			//creating the new byte array input stream
		ByteArrayInputStream bi =new ByteArrayInputStream(b);
		int i;
		while((i=bi.read())!=-1) {
			char ch =((char)i);			//converting byte to char
			System.out.println("ASCII character is" +i+ ", "+"value is " +ch);
			
		}
		
		/* ASCII character is66, value is B
		ASCII character is68, value is D
		ASCII character is67, value is C
		ASCII character is90, value is Z
		 * 
		 * */

	}
	
	

}
