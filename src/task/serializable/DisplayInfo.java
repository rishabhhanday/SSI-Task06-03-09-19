package task.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DisplayInfo implements Serializable {

	public DisplayInfo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)throws Exception {
		FileInputStream fis = new FileInputStream("F:/Employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp = (Employee) ois.readObject();
		System.out.println(emp.getEmpNo()+"" +emp.getEname());
	}

}
