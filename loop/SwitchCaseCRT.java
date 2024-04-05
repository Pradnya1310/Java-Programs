package loop;

import java.util.Scanner;

public class SwitchCaseCRT {

	public static void main(String[] args) {
		int a, b, c,avg;
        char ans;
        String optional;
        double radius, area, base, height, areatri;
        Scanner sc= new Scanner(System.in);

		System.out.println("Enter option");
		System.out.println("1.For Addition '+'");
		System.out.println("2.For substraction '-'");
		System.out.println("3.For Multiflication'*'");
		System.out.println("4.For Division'/'");
		System.out.println("6.For Area of Rectangle 'area'");
		System.out.println("7.For Area of circle 'areac'");
		System.out.println("8.For Area of Triangle 'areatri'");
		
		optional=sc.next();
		
		switch (optional) {

		case "+":

		System.out.println("Enter the value of a and b: ");
		a=sc.nextInt();
		b =sc.nextInt();
		c=a+b;
		System.out.println("Addition of this two numbers is:");
		break;

		case "-":

		System.out.println("Enter the value of a and b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		System.out.println("Substraction of this two number is:"+c);
		break;

		case "*":

		System.out.println("Enter the value of and b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println("Multiflication of this two numbers is:"+c);

		break;

		case "/":

		System.out.println("Enter the value of a and b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division of this two numbers is:"+c);

		break;

		case "area":

		System.out.println("Enter the value of a and b ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println("Area of this rectangle is:"+c);

		break;

		case "areac":

		System.out.println("Enter the value of radius");
		radius= sc.nextDouble();
		area=3.14*radius* radius;
		System.out.println("Area of circle is:" +area);
		break;

	}

}
}
