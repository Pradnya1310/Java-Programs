package ClassandObject;

import java.util.Scanner;

public class EmployeeMethodEx {
	String empName;
	double empCode;
	double allowance;
	double grossSalary;
	double basicSalary;
	double tax;
	double netSalary;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empName:");
		empName=sc.nextLine();
		System.out.println("Enter empCode:");
		empCode=sc.nextInt();
		System.out.println("Enter basicSalary:");
		basicSalary=sc.nextDouble();
		
	}
	public void allow() {
	allowance=0.55*basicSalary;
	}
	public void gross() {
		grossSalary=basicSalary*allowance;
	}
	public void tax() {
		tax=0.12*grossSalary;
	}
	public void netSalary() {
		netSalary=grossSalary-tax;
	}
	public void display() {
		System.out.println("EmpName: "+empName);
		System.out.println("EmpCode: "+empCode);
		System.out.println("BasicSalary: "+basicSalary);
		System.out.println("Allowance: "+allowance);
		System.out.println("GrossSalary: "+grossSalary);
		System.out.println("Tax: "+tax);
		System.out.println("NetSalary: "+netSalary);
		
	}
	public static void main(String[] args) {
		EmployeeMethodEx employeemethodex=new EmployeeMethodEx();
		employeemethodex.accept();
		employeemethodex.allow();
		employeemethodex.gross();
		employeemethodex.display();
	
		
		
	}

}
