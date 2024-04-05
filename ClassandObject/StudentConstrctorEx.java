package ClassandObject;

public class StudentConstrctorEx {
	double percentage,total;
	int id,m1,m2,m3;
	String name;
	public StudentConstrctorEx() {
		id=101;
		name="Pradnya";
		m1=80;
		m2=85;
		m3=90;
		
	}
	public StudentConstrctorEx(int id, String name,int m1,int m2,int m3)
	{
		this.id=id;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	public void calculate()
	{
		total=m1+m2+m3;
		percentage=total/3;
		System.out.println("Total: "+total);
		System.out.println("Percantage: "+percentage);
	}

}
