package Collection;

import java.util.ArrayList;
import java.util.List;

public class TestProduct {
	List<String> product1 = new ArrayList<>();
	
	public void add() {
		product1.add("Maggie");
		product1.add("Biscuit");
		product1.add("Soap");
		product1.add("Hair Oil");
		
		System.out.println("After Adding Elements List is: ");
		for(String name:product1) {
			System.out.println(name);
		}
   }
	public void update() {
		int indexAt=1;
		product1.set(indexAt,"Scrubers");
		
		System.out.println("Updated List: ");
		for(String name:product1) {
			System.out.println(name);
		}
		
	}
	public void delete() {
		product1.remove("Hair Oil");
		product1.remove(2);
		
		System.out.println("After Removing specific element list is: ");
		for(String name:product1) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		TestProduct TP=new TestProduct();
		TP.add();
		TP.update();
		TP.delete();
	}


}
