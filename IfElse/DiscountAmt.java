package IfElse;

import java.util.Scanner;

public class DiscountAmt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double purchaseAmount,discountAmount;
		System.out.println("Enter the purchase amount");
		purchaseAmount=sc.nextDouble();
		
		if(purchaseAmount>=10000) {
			discountAmount=0.1*purchaseAmount;
			System.out.println("Discount amount on your purchase is:"+discountAmount);
		}
			
			else {
				discountAmount=0.02*purchaseAmount;
				System.out.println("Discunt amount on your purchase is:"+discountAmount);
		}

	}
}
