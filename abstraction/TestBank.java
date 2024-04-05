package abstraction;

import java.util.Scanner;

abstract class Bank {
	public abstract double getRateOfInterest1();

	abstract void getBalance();
}
class Axis extends Bank{

	@Override
	public double getRateOfInterest1() {
		// TODO Auto-generated method stub
		return 8.2;
	}

	@Override
	void getBalance() {
		// TODO Auto-generated method stub
		
	}	

	
}
class Sbi extends Bank {

	@Override
	public double getRateOfInterest1() {
		// TODO Auto-generated method stub
		return 6.2;
	}

	@Override
	void getBalance() {
		// TODO Auto-generated method stub
		
	}

				
	
	
}

public class TestBank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double principleAmt,years,rateSbi,rateAxis;
		System.out.println("Enter principle amount and no of years: ");
		principleAmt=sc.nextDouble();
		System.out.println("Enter years: ");
		years=sc.nextDouble();
		
		Bank bank;
		
		bank=new Sbi();
		rateSbi=bank.getRateOfInterest1();
		
		bank=new Axis();
		rateAxis=bank.getRateOfInterest1();
		
		double interestSbi=principleAmt*years*rateSbi/100;
		double interestAxis=principleAmt*years*rateAxis/100;
		
		System.out.println("Simple Interest for SBI: "+interestSbi);
		System.out.println("Simple Interest for AXIS: "+interestAxis);
	}

}



































































