package ClassandObject;

import java.util.Scanner;

public class Student {
	int rollNumber;
    String name;
	float Java,Cpp,Python;
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollNumber:");
		rollNumber=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name:");
		name=sc.nextLine();
		
		System.out.println("Enter marks of Java,Cpp,Python");
		Java=sc.nextFloat();
		Cpp=sc.nextFloat();
		Python=sc.nextFloat();
		
	}
	
	public void calculate()
	{ 
		float total,percentage;

		total=Java+Cpp+Python;
		percentage=total/3;
		System.out.println("Student rollNumber:" + rollNumber);
		System.out.println("Student name:"+ name);
		System.out.println("Total:" + total);
		System.out.println("Percentage:" + percentage);
	}
	public static void main(String[] args) {
		Student student1=new Student();
		student1.accept();
		student1.calculate();
	}

}
