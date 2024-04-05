package IfElse;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.printf("Enter the Number : ");
		num = input.nextInt();
		if(num % 2==0)
		{
		System.out.println("This is a Even Number");
		
		
		}
		else {

	    System.out.println("This is a Odd Number");
		}
	}
}
      
