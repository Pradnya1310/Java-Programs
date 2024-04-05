package Relationships;

public class SalesPerson extends Employee {
	float sales,comission,totalSalary;
	
	public SalesPerson()
	{
		super();
		sales=70;
		
	}
	public SalesPerson(int id,String name,MyDate dob,Address address,float perDay,float workinDays,float sales)
	{
		super(id,name,dob,address,perDay,workinDays);
		this.sales=sales;
		
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		if(sales>95)
			comission=salary*2f;
		else if(sales>75)
			comission=salary*0.15f;
		else if(sales>60)
			comission=salary*0.1f;
		else
			comission=0;
		
		totalSalary=salary+comission;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Sales: "+sales);
		System.out.println("Comission: "+comission);
		System.out.println("Total Salary: "+totalSalary);
	}

}
