package whileloop;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int n,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		n=sc.nextInt();
		
		int original=n;
		
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(original==rev)
		System.out.println("Palindrom");
		else 
			System.out.println("not Palindrom");
		
			
		

	}

}
