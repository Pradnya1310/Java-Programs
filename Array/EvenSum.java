package Array;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of array:");
		int size=sc.nextInt();//5
		
		int arr[]=new int[size];
		
		System.out.println("Enter array elements:");
		int i,evensum=0;
		for(i=0;i<size;i++)
          arr[i]=sc.nextInt();
		
		for(i=0;i<size;i++)
			if(arr[i]%2==0)
				System.out.println("Sum of even number:"+sum);
			
		
		}
		

	}

