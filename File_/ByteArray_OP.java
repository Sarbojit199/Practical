package javak;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArray_OP {
			public static void main(String[] args) {
				try {
					FileOutputStream f1 =new FileOutputStream("C:\\Users\\Public\\Documents\\text3.txt");
					
					FileOutputStream f2 =new FileOutputStream("C:\\Users\\punor\\text2.txt");
					ByteArrayOutputStream bos= new ByteArrayOutputStream();
					bos.write(65);					//writing  the ascii char
					bos.writeTo(f1);				//writing into the txt file with ascii character a
					bos.writeTo(f2);				//writing into the txt file with char-> a
					bos.close();
					System.out.println("done");
				} catch (Exception e) {
					System.out.println(e);
					// TODO: handle exception
				}
			}
}
