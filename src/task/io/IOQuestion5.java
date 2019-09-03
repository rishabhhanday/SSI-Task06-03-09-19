package task.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class IOQuestion5 {

	public static void main(String[] args) throws Exception {
		String dirName = args[0];
		File file = new File("F:/" + dirName);
		FileOutputStream fos= new FileOutputStream("F:/merge",true);
		String files[] = file.list();
		for (String fileName : files) {
			FileInputStream fis = new FileInputStream("F:/"+dirName+"/"+fileName);
			byte[] b = new byte[fis.available()];
			fis.read(b);
			fos.write(b);
			fis.close();
		}
		fos.close();
		System.out.println("Your files in folder :"+args[0]+" are stored in F:/merge");
	}

}
