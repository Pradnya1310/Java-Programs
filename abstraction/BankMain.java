package abstraction;

import abstraction.TestBank2.Bank;
import abstraction.TestBank2.BankA;
import abstraction.TestBank2.BankB;
import abstraction.TestBank2.BankC;

public class BankMain {
public static void main(String[] args) {
		
		Bank bank;
		BankA bankA=new BankA();
		bankA.getBalance();
		
		BankB bankB = new BankB();
		bankB.getBalance();
		
		BankC bankC=new BankC();
		bankC.getBalance();
		
		System.out.println("Balance in Bank A:$"+bankA.getBalance());
		System.out.println("Balance in Bank B:$"+bankB.getBalance());
		System.out.println("Balance in Bank C:$"+bankC.getBalance());
		
	}
}



