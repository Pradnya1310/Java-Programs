package Collection;
import java.util.*;
public class CRUDDemo {
	List<String> list1 = new ArrayList<String>();
	
	public void create() {
		
		list1.add("Mango");
		list1.add("Banana");
		list1.add(null);
		list1.add("Mango");
		list1.add("Papaya");
		list1.add("Guava");
		
		System.out.println("After Adding Element List Is: ");
		for(String name: list1) {
			System.out.println(name);
		}
		

	}
	public void update() {
		int indexAt=1;
		list1.set(indexAt,"Cherry");
		
		System.out.println("Updated List: ");
		for(String name: list1) {
			System.out.println(name);
			
		}
		
	}
	public void delete() {
		list1.remove("Guava");
		list1.remove(2);
		
		System.out.println("After Removing specific element list is: ");
		for(String name:list1) {
			System.out.println(name);
		}
		
	}
	public static void main(String[] args) {
		CRUDDemo obj=new CRUDDemo();
		obj.create();
		obj.update();
		obj.delete();
		
	}

}
