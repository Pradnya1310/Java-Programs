package Array;

import java.util.Scanner;

public class HighestLowest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array value:");
		int size=sc.nextInt();
		int a[]=new int [size];
		
	 System.out.println("Enter array elements:");
	 
	 for(int i=0;i<a.length;i++) {
		 
		 a[i]=sc.nextInt();
		 
	 }
	 int highest=a[0];
	 for(int i=1;i<a.length;i++) {
	 if(a[i]>highest)
		 highest=a[i];
}
System.out.println("Highest value:"+ highest);
	//lowest element
     int  lowest=a[0];
	for(int i=0;i<a.length;i++) 
	{
		if(a[i]<lowest) {
			lowest=a[i];
	}
}
	System.out.println("Lowest value:"+lowest);
	}
}

