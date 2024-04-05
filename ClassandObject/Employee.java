package ClassandObject;

import java.util.Scanner;

public class Employee {
     int EmpId;
     String EmpName;
     double WorkingDays;
     double PerDaySalary;
     double Salary;
     
     //Method to accept employee details from the user
     public void accept() {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter EmpId:");
    	 EmpId=sc.nextInt();
 		 sc.nextLine();
 		 
 		 System.out.println("Enter EmpName:");
 		 EmpName=sc.nextLine();
 		 
 		 System.out.println("Enter WorkinDays:");
 		 WorkingDays=sc.nextInt();
 		 
 		 System.out.println("Enter Salary:");
 		 int Salary=sc.nextInt();
 		 
  }
     //Method to calculate employee salary
     public void calculate() {
    	 
    	 Salary=WorkingDays+PerDaySalary;
    	 
   }
     //Main Method to test the Employee Class 
     public void display() {
    	 System.out.println("Enter EmpId:"+ EmpId);
    	 System.out.println("Enter EmpName:"+ EmpName);
    	 System.out.println("WorkingDays:"+ WorkingDays);
    	 System.out.println("PerDaySalary:"+ PerDaySalary);
    	 System.out.println("Total Salary:"+ Salary);
     }
     public static void main(String[] args) {
    	 Employee Emp=new Employee();
    	 Emp.accept();//Accept employee details
    	 Emp.calculate();//Calculate salary
    	 Emp.display();//Display employee details
		
	}
    
     
}
