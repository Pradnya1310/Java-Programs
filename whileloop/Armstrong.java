package whileloop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int sum=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int temp=n;
	   while(n>0) 
	   {
		   rem=n%10;
		   n=n/10;
	       sum=sum+(rem*rem*rem);
	       n=n/10;
	}
	   if(temp==sum) {
		   System.out.println("Armstrong");
	   }
	   else
			System.out.println("not Armstrong");
	
		
		
		
		
	}
}

