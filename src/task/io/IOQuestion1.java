package task.io;

import java.io.File;

public class IOQuestion1 {

	public IOQuestion1() {

	}

	public static void main(String[] args) {
		String file1 = args[0];
		String file2 = args[1];
		File f1 = new File(file1);
		File f2 = new File(file2);
		if (f1.exists()) {
			if (f1.isFile()) {
				if (!f2.isFile()) {
					if(f1.length() < 500){
						f1.renameTo(f2);
						System.out.println("File renamed");
					}
					else
						System.out.println("File size is greater than 500 therfore can't rename");
				} else
					System.out.println("F2 file exists therefore cant rename file 1");
			} else
				System.out.println("File1 is a folder");
		} else
			System.out.println("File 1 does not exist");

	}

}
