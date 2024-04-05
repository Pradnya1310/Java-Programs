package Array;

import java.util.Scanner;

public class Assending {

	public static void main(String[] args) {
		int i,j,size=0,temp;
		int a[]=new int [size];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		size=sc.nextInt();
		System.out.println("Enter array elements:");
		
		for(i=0;i<a.length-1;i++) 
		{
			a[i]=sc.nextInt();
			for(j=i+1;j<a.length;j++) 
			{
              if(a[i]>a[j]);
              {
            	temp=a[i];
            	a[i]=a[j];
            	a[j]=temp;
              }
			}
			
			
		}
		System.out.println("Assending Order:");
		for(i=0;i<a.length;i++) {
			System.out.println(""+a[i]);
				
			
		}
		
		

		

	}

}
