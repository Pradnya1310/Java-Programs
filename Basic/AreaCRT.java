package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaCRT {

	public static void main(String[] args)throws NumberFormatException,IOException {
		int area;
	
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int r=Integer.parseInt(reader.readLine());
		int l=Integer.parseInt(reader.readLine());
		int b=Integer.parseInt(reader.readLine());
		int a=Integer.parseInt(reader.readLine());
		int h=Integer.parseInt(reader.readLine());
		 area=(22/7*r*r);
		System.out.println("Area of circle"+area);
		
		area=l*b;
		System.out.println("Area of rectangle"+area);
		
		area=a=b*h/2;
		System.out.println("Area of triangle"+area);
		
		
		
		
		
		
		
		
	}
}

		
