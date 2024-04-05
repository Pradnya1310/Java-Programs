package IfElse;

import java.util.Scanner;

public class Licence {

	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		if(age>18)
		{
		System.out.println("Eligible for Licence");
		}
		else {
			System.out.println("Not Eligible for Licence");
		}
		
	}	
}
