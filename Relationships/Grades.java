package Relationships;

public class Grades extends Student{
	double grades;
	
	public Grades() {
		super();
	}
	
	public Grades(int id,String name,MyDate dob,Address address,double phy,double chem,double maths) {
			super(id,name,dob,address,phy,chem,maths);
			this.phy=phy;
			this.chem=chem;
			this.maths=maths;
			this.grades=grades;
			
		}
		public void calculate() {
			double total=phy+chem+maths;
			double percentage=total/3;
			
			super.calculate();
			if(percentage>=90) {
				System.out.println("Grade A");
			}
			else if(percentage>=80) {
				System.out.println("Grade B");
			}
			else if(percentage>=60) {
				System.out.println("Grade C");
			}
			else if(percentage>=50) {
				System.out.println("Grade D");
			}
			else {
				System.out.println("Failed");
				
		  }
		}
		   @Override
			public void display(){
				// TODO Auto-generated method stub
				super.display();
				System.out.println("Grades "+grades);
			}


			
				
}
	
			

			

	


