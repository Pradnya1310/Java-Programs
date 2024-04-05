package IfElse;

import java.util.Scanner;

public class PosNegZero {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		if(a>0)
		{
			System.out.println("a is positive");
			
		}
		else  if(a<0)
		{
			System.out.println("a is negative");
		}
		else
		{
			System.out.println("a is zero");
		}
		

	}

}
