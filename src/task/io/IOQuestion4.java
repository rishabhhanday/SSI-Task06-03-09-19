package task.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOQuestion4 {
	public static void main(String args[])throws Exception{
		int noOfFiles = Integer.parseInt(args[2]);
		File file = new File(args[0]);
		File dir = new File("F:/"+args[1]);
		dir.mkdir();
		int fileNo =0;
		FileInputStream fis = new FileInputStream(file);
		int reminder  = fis.available() % noOfFiles;
		int sizeOfEachFile = (fis.available() - reminder)/noOfFiles;
		FileOutputStream fos = null;
		while(fileNo<noOfFiles){
			 fos = new FileOutputStream("F:/"+args[1]+"/file"+fileNo++,true);
			byte[] b = new byte[sizeOfEachFile];
			fis.read(b);
			fos.write(b);
		}
		byte[] rem = new byte[reminder];
		fis.read(rem);
		fos.write(rem);
		fis.close();
		System.out.println("Files are splitted and stored in folder +"+args[1]);
		
	}

}
