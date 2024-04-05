package loop;

import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		int a,b,c;
		char ch;
		
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter 2 numbers:");
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a+b;
			
			System.out.println("Addition:"+c);
			
			System.out.println("Press Y to continue");
			ch=sc.next().charAt(0);
		}while(ch=='Y'||ch=='y');
	 }



	}

