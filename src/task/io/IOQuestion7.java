package task.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class IOQuestion7 {
	public static void main(String args[]) throws Exception{
		FileInputStream fr1 = new FileInputStream(args[0]);
		FileInputStream fr2 = new FileInputStream(args[1]);
		SequenceInputStream sis = new SequenceInputStream(fr1,fr2);
		int length = sis.available();
		int i;
		while(( i = sis.read()) != -1){
			System.out.println((char)i);
		}
		/*FileOutputStream fos = new FileOutputStream(args[2]);
		byte b []  =new byte[sis.available()];
		fr1.read(b);
		fos.write(b);
		fr2.read(b);
		fos.write(b);
		fos.close();
		sis.close();
		fr1.close();
		fr2.close();*/
		
		System.out.println("File Merged");
	}
}
