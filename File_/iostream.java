package javak;

import java.io.FileOutputStream;

public class iostream {
	public static void main(String[] args) {
		try {
			FileOutputStream f= new FileOutputStream("C:\\Users\\punor\\abcde.txt");
			
			String s="welcome";				//reading into the file
			byte b[]= s.getBytes();
			f.write(b);
			f.close();
			System.out.println("done");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
