package Relationships;

public class Address {
	String addrLine;
	String street;
	String city;
	int pincode;
	
	public Address() {
		addrLine="Kiwle";
		street="Dehuroad";
		city="Pune";
		pincode=412101;
		
	}
	public Address(String addrLine,String street,String city,int pincode) {
		this.addrLine=addrLine;
		this.street=street;
		this.city=city;
		this.pincode=pincode;
	}
	public void display() {
		System.out.println(addrLine+","+street+","+city+","+pincode);
		
	}
	

}
