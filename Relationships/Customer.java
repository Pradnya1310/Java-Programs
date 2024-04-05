package Relationships;

public class Customer extends Person{
	String prodName;
	double quantity;
	double price;
	double billAmount;


	public Customer()
	{
	super();
	this.prodName="Prodcut1";
	this.quantity=500;
	this.price=30;
	this.billAmount=15000;
	
	
	}
	public Customer(int id,String name,MyDate dob,Address address,String prodName,double quantity,double price,double billAmount)
	{
		super(id,name,dob,address);
		this.prodName=prodName ;
		this.quantity=quantity ;
		this.price=price;
		this.billAmount=quantity*price;
	
	}
	public void calculate() {
		double billAmount = 0;
		double discount;
		float finalBill;
	
		if(billAmount>=20000) {
			discount=billAmount*0.15f;
		}
		else if(billAmount>=15000) {
			discount=billAmount *0.10f;
		}
		else if(billAmount>=10000) {
			discount=billAmount*0.7f;
		}
		else {
	         discount=0;
		}
		
         
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("BillAmount: "+billAmount);
		double discount=0;
		System.out.println("Discount: "+discount);
		double finalBill=0;
		System.out.println("FinalBill: "+finalBill);
	}
	
		
}


