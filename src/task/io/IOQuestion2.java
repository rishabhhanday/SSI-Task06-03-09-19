package task.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

public class IOQuestion2 {

	public static void main(String[] args) throws Exception {
		String file1 = args[0];
		String file2 = args[1];
		File f1 = new File(file1);
		File f2 = new File(file2);
		FileReader fr = new FileReader(f1);
		PrintStream ps = new PrintStream(f2);
		BufferedReader fbr1 = new BufferedReader(fr);
		String st;
		while ((st = fbr1.readLine()) != null) {
			ps.println(st);
		}
		ps.close();
		fbr1.close();
		System.out.println("contents of file "+args[0]+" copied to file "+args[1]);
	}

}
