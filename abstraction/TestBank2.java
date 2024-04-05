package abstraction;

public class TestBank2 {
abstract class Bank{
	
	public abstract double getBalance();
}
class BankA extends Bank{

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Deposited:$100");
				return 100;
		}
	
}
class BankB extends Bank{

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Deposited:$150");
		return 150;
	}
	
}
class BankC extends Bank{

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Deposited:$200");
				return 200;
	}
	
}

}
