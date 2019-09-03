package task.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IOQuestion6 {

	public static void main(String[] args) throws Exception {
		File file = new File(args[0]);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		fr.close();
		file.delete();
		System.out.println("File "+args[0]+" is deleted");
	}

}
