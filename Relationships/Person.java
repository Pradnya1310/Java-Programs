package Relationships;

public class Person {
	int id;
	String name;
	MyDate dob;
	Address address;
	
	public Person() {
		id=101;
		name="Pradnya";
		dob=new MyDate();
		address=new Address();
		
	}
	public Person(int id,String name,MyDate dob,Address address) {
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.address=address;
		
	}
	public void display() {
		System.out.println("Person id:"+id);
		System.out.println("Person name:"+name);
		dob.display();
		address.display();
	}
	
	

}
