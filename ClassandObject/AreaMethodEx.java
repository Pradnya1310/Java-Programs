package ClassandObject;

public class AreaMethodEx {
	
	
	public static double circle(double radius) {
		return Math.PI*radius*radius;
	}
	public static double square(double side) {
		return side*side;
		
	}
	public static double triangle(double length,double width) {
		return length*width;
		
	}
	public static double rectangle(double base,double height ) {
		return base*height;
	}
	public static void main(String[] args) {
		double radius=5;
		double side=6;
		double length=7;
		double width=3;
		double base=8;
		double height=10;
		
		System.out.println("Area of circle:"+ circle(radius));
		System.out.println("Area of square:"+ square(side));
		System.out.println("Area of triangle:"+ triangle(length,width));
		System.out.println("Area of rectangle:"+ rectangle(base,height));
		
		
		
	}

}
