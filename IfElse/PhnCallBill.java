package IfElse;

import java.util.Scanner;

public class PhnCallBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int billAmount,numberOfCalls;
		
		System.out.println("Enter the number of calls:");
		numberOfCalls=sc.nextInt();
		
		if(numberOfCalls<100) {
			billAmount=1*numberOfCalls;
			System.out.println("Your bill amount is:"+billAmount);
		}
		else {
			billAmount=3*numberOfCalls;
			System.out.println("Your bill amount is:"+billAmount);
		}
	}

}
