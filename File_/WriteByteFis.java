package javak;

import java.io.FileInputStream;

public class WriteByteFis {

	public static void main(String[] args) {
		try {
			FileInputStream f= new FileInputStream("C:\\\\Users\\\\punor\\\\abcde.txt");			//path of the file
			int i= f.read();
			System.out.println((char)i);				//writing the file 
			f.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}

	}

}
