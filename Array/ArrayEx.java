package Array;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		size=sc.nextInt();
		int b[]=new int[size];
		
		System.out.println("Enter "+size+" array elements:");
		for(i=0;i<b.length;i++){
			b[i]=sc.nextInt();
		}
	}

}
