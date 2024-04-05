package Relationships;

public class Student extends Person{
	double phy,chem,maths,total,percentage;
	
	public Student() {
		super();
		phy=70;
		chem=80;
		maths=90;
    }
	public Student(int id,String name,MyDate dob,Address address,double phy,double chem,double maths) {
		super(id,name,dob,address);
		this.phy=phy;
		this.chem=chem;
		this.maths=maths;
		
		
	}
	public void calculate() {
		total=phy+chem+maths;
		percentage=total/3;
	}

		@Override
		public void display() {
			// TODO Auto-generated method stub
			super.display();//calling parent class method
			System.out.println("Total: "+total);
			System.out.println("Percentage: "+percentage);
			
	}

}
