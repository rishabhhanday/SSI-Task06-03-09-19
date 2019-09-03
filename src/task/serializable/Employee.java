package task.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {
	int empNo;
	int salary;
	String ename;
	String designation;
	String dept;

	public int getEmpNo() {
		return empNo;
	}

	public int getSalary() {
		return salary;
	}

	public String getEname() {
		return ename;
	}

	public String getDesignation() {
		return designation;
	}

	public String getDept() {
		return dept;
	}

	

	public Employee() {

	}

	public static void main(String... sd) throws Exception {
		FileOutputStream fos = new FileOutputStream("F:/Employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter emp no");
		emp.empNo = sc.nextInt();
		System.out.println("enter emp salary");
		emp.salary = sc.nextInt();
		System.out.println("enter emp name");
		emp.ename = sc.next();
		System.out.println("enter emp designation");
		emp.designation = sc.next();
		System.out.println("enter emp dept. name");
		emp.dept = sc.next();

		oos.writeObject(emp);
		oos.close();
		fos.close();
		System.out.println("DATA STORED");
	}

}
