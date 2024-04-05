package Array;

import java.util.Scanner;

public class SumOfArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five elements of array:");
		int size=sc.nextInt();
		int a[]=new int [size];
	    int i;
	    int sum=0;
		
		for(i=0;i<a.length;i++) {
		  a[i]=sc.nextInt();
		}
	
	     System.out.println("Array Elements:");
	     for(i=0;i<a.length;i++) 
	     {
	    	 System.out.println(a[i]+"");
	    	 sum=a[i]+sum;
	     }
			System.out.println("Sum of array elemnts:"+sum);
		}

	}



