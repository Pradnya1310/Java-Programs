package ClassandObject;

public class CircleConstrctorEx {
	double radius,area;
	public CircleConstrctorEx() 
	{
		radius=4;
	}
	public CircleConstrctorEx(double radius)
	{
		this.radius=radius;
	}
	public void circle() {
		area=(3.14*radius*radius);
		System.out.println("Area of circle is: "+area);
	}
	public static void main(String[] args) {
		CircleConstrctorEx cc=new CircleConstrctorEx();
		cc.circle();
	}

}
