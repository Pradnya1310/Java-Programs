package ClassandObject;

public class Area {
	
	//parameterized without return type 
	public void circle(double  radius ) {
		double area=radius*radius;
		System.out.println("Enter area of circle:"+ area);
	}
	public void triangle(double base,double height) {
		double area=0.5*base*height;
		System.out.println("Enter area of triangle:"+ area);
	}
	//parameterized with return type 
	public int square(int side) {
		int area=side*side;
		return area;
	}
		
		public int rectangle(int length,int breadth) {
			int area=length*breadth;
			return area;
	}
		public static void main(String[] args) {
			Area areaCalculator= new Area();
			areaCalculator.circle(5);
			areaCalculator.triangle(3,4);
			System.out.println("Area of square:"+ areaCalculator.square(6));
			System.out.println("Area of rectangle:"+ areaCalculator.rectangle(4,5));
			
		}
		
	}

