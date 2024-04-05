package Relationships;

public class Employee extends Person{
	float perDay,workingDays,salary;
	
	public Employee() {
		super();//calls super class constructor
		perDay =1200;
		workingDays =18;
	}
	public Employee(int id,String name,MyDate dob,Address address,float perDay,float workingDays) {
		super(id,name,dob,address);
		this.perDay=perDay;
		this.workingDays=workingDays;
	}
	public void calculate() {
		salary=workingDays*perDay;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();//calling parent class method
		System.out.println("Salary is:"+salary);
	
		
	}
	
	

}
