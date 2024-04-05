package ClassandObject;

public class AreaRectangleConstructorEx {
	double length,breadth,area;
	public  AreaRectangleConstructorEx() {
		length=10;
		breadth=5;
		
	} 
	
	
	{
		double length,breadth,area;
		length=10;
		breadth=5;
	}
	public AreaRectangleConstructorEx(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;

		
	}
	public void rectangle(){
		area=length*breadth;
		System.out.println("Area of rectangle:"+area);
	}
	
	public static void main(String[] args) {
		AreaRectangleConstructorEx ac=new AreaRectangleConstructorEx(10, 5);
		ac.rectangle();
	}
	}


