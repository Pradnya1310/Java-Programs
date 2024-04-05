package ClassandObject;

import java.util.Scanner;

public class CalledBestMethodEx {
	String custName;
	float phoneNo;
	float numOfCalls;
	float tax;
	float bill;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name: ");
		custName=sc.next();
		System.out.println("Enter phone num: ");
		phoneNo=sc.nextFloat();
		System.out.println("Enter no of calls: ");
		numOfCalls=sc.nextFloat();
		
	}
	public void billing() 
	{
		if(numOfCalls<100)
		{
			System.out.println("Null");
		}
		else if(numOfCalls<=300)
		{
			System.out.println("0.80 rs");
		}
		else if(numOfCalls<=500)
		{
			System.out.println("1.25 rs");
		}
		else if(numOfCalls>500)
		{
			System.out.println("2.50 rs");
		}
		

    }
	public void finalBill() {
		System.out.println("FinalBill: "+0.12*numOfCalls);
	}
	public static void main(String[] args) {
		
		CalledBestMethodEx c1=new CalledBestMethodEx();
		c1.accept();
		c1.billing();
		c1.finalBill();
				
		
	}
}
