package javak;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Buffered_OP {

	public static void main(String[] args) {
		try {
			FileOutputStream f= new FileOutputStream("C:\\Users\\punor\\abcde.txt");
			BufferedOutputStream bos= new BufferedOutputStream(f);
			String s="i m good";
			byte b[]= s.getBytes();
			f.write(b);
			f.close();
			System.out.println("done");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} 
		
		//we will read in console
		
		//file with buffered input stream
		try {
			FileInputStream f= new FileInputStream("C:\\\\Users\\\\punor\\\\abcde.txt");
			BufferedInputStream bis= new BufferedInputStream(f);
			//int i= f.read();
			int i=0;
			while((i=f.read())!=-1) {
			System.out.print((char)i);
			}
			f.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}

	}

}
