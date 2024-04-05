package ClassandObject;

import java.util.Scanner;

public class EmployeeConstructor {
	double empId;
	String empName;
	double workingDays;
	double perDaySalary;
	
	public EmployeeConstructor() {
		empId=1;
		empName="";
		workingDays=0;
		perDaySalary=0.0;
		
		
	}
	public EmployeeConstructor(int empId,String empName,int workingDays,int perDaySalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.workingDays=workingDays;
		this.perDaySalary=perDaySalary;
		
	}
	public double calculateSalary() {
		return workingDays*perDaySalary;		
	}
	public static void main(String[] args) {
		EmployeeConstructor employeeConstructor1=new EmployeeConstructor();
		employeeConstructor1.empId=101;
		employeeConstructor1.empName="Prdanya";
		employeeConstructor1.workingDays=28;
		employeeConstructor1.perDaySalary=100.0;
	
		
		
	}


}
