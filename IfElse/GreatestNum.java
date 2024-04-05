package IfElse;

import java.util.Scanner;

public class GreatestNum {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        a=sc.nextInt();
        System.out.println("Enter value of b");
        b=sc.nextInt();
        System.out.println("Enter value of c");
        c=sc.nextInt();
        if(a>b||a>c)
        {
        System.out.println("a is the greater number");
        }
        else if(b>a||b>c)
        {
        System.out.println("b is the greater number");
        }
        else if(c>a||c>b)
        {
        System.out.println("c is the greater number");
        }
	}
}
	
