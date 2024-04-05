package IfElse;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double phy,chem,bio;
		double total,percentage;
		String grade;
		
		System.out.println("Enter the marks of subject:");
	    phy=sc.nextDouble();
	    chem=sc.nextDouble();
	    bio=sc.nextDouble();
	    
	    total=phy+chem+bio;
	    percentage=total/3;
	    
	    System.out.println("Total marks:+total");
	    System.out.println("Percentage of marks:"+percentage);
	    
	    if(percentage>=90) {
	    System.out.println("Grade A");
	    }
	    else if(percentage>=80) {
	    System.out.println("Grade B");
	    }
	    else if(percentage>=60) {
	    System.out.println("Grade C");
	    }
	    else if(percentage>=50) {
	    System.out.println("Grade D");
	    }
	    else {
	    	System.out.println("Failed");
	    }

	 }

}
