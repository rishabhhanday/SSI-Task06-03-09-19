package task.io;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class IOQuestion3 {

	public static void main(String[] args) throws Exception {
		File file = new File(args[0]);
		PrintStream ps = new PrintStream(file);
		Scanner sc = new Scanner(System.in);
		outer: while (true) {

			System.out.println("Press 1 to enter city,Press 2 to exit");
			int option = sc.nextInt();
			if (option == 2)
				break outer;
			else {
				System.out.println("Enter City");
				String cityName = sc.next();
				ps.println(cityName);
			}

		}
		System.out.println("City Names Stored");
		ps.close();
	}

}
