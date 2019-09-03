package task.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class ThreeD extends TwoD {

	int z;

	void move(int x, int y, int z) {
		this.x = this.x + x;
		this.y = this.y + y;
		this.z = this.z + z;
	}

	void showLocation() {
		System.out.println("x : " + x + " y: " + y + " z: " + z);
	}

	public static void main(String... sd) throws Exception {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("F:/trial.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println("press 1 to load game, 2 Press for new game");
		int option = sc.nextInt();
		int newX = sc.nextInt();
		int newY = sc.nextInt();
		int newZ = sc.nextInt();
		ThreeD td = null;
		if (option == 1) {
			FileInputStream fis = new FileInputStream("F:/trial.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			td = (ThreeD) ois.readObject();
			ois.close();
			fis.close();
		} else {
			td = new ThreeD();

		}
		td.move(newX, newY, newZ);
		td.showLocation();
		oos.writeObject(td);
		oos.close();
		fos.close();

	}
}
