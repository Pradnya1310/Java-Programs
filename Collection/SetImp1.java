package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImp1 {
	
	public static void main(String[] args) {
		Set<String> hashset=new HashSet<>();
		hashset.add("Riya");
		hashset.add("Ravi");
		hashset.add("Riya");
		hashset.add("Meera");
		hashset.add(null);
		
		System.out.println("implementing Hashset: ");
		for(String string : hashset) {
			System.out.println(string);
		}
		LinkedHashSet<String> linkedHashSet= new LinkedHashSet<>();
		linkedHashSet.add("Mango");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Guava");
		linkedHashSet.add(null);
		
		System.out.println("implementing LinkedHashSet: \n"+linkedHashSet);
		
		TreeSet<String>treeSet=new TreeSet<>();
		treeSet.add("Pizza");
		treeSet.add("Burger");
		treeSet.add("Coffee");
		treeSet.add("Burger");
		treeSet.add(null);
		
		System.out.println("imp[lementing TreeSet: \n"+treeSet);
		




		



		
	}

}
