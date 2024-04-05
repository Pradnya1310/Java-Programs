package IfElse;

import java.util.Scanner;

public class TaxAmt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double salary,taxAmount;
		System.out.println("Enter the salary");
		salary=sc.nextDouble();
		
		if(salary<25000){
		taxAmount=0.1*salary;
		System.out.println("Tax Amount on salary:"+taxAmount);
		}
		else { 
	    	taxAmount=0.15*salary;
	    	System.out.println("Tax Amount on salary:"+taxAmount);
	    	
		  
	}

  }
}
