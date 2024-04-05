package Basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area {
	public static void main(String args[]) throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the radius of the circle:");
		double radius=Double.parseDouble(reader.readLine());
		double circleArea=Math.PI*radius*radius;
		System.out.println("Area of the circle:"+circleArea);
		
		System.out.println("Enter the length of the recatngle");
		double length=Double.parseDouble(reader.readLine());
		System.out.println("Enter the width of the recatangle:");
		double width=Double.parseDouble(reader.readLine());
		double rectangleArea=length*width;
		System.out.println("Area of the rectangle:"+rectangleArea);
		
		System.out.println("Enter the base length of the triangle:");
		double base=Double.parseDouble(reader.readLine());
		System.out.println("Enter the height length of the triangle:");
		double height=Double.parseDouble(reader.readLine());
		double triangleArea=0.5*base*height;
		System.out.println("Area of the triangle:");

		System.out.println("Enter the height of the triangle:"+triangleArea);
		
		reader.close();
	}
	
}
