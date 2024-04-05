package Basic;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String args[])
	{

    double area;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int r=sc.nextInt();
	int l=sc.nextInt();
	int b=sc.nextInt();
	
	area =  (3.14*r*r);
	System.out.println("Area of circle"+area);
	 
	area=l*b;
	System.out.println("Area of rectangle"+area);
   
	}
}
