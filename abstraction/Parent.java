package abstraction;

abstract class Parent {
	abstract void message();

}
class FirstSubclass extends Parent{

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This is first subclass");
		
	}
}
class SecondSubclass extends Parent{

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass");
		
	}
}
