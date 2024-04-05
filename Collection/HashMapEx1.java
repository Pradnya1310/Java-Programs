package Collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class HashMapEx1 
{
	
	void HashMapDemo()
	{
		HashMap<Integer,String>map=new HashMap<Integer, String>();
		map.put(1,"Apple");
		map.put(2,"Banana");
		map.put(3,"Mango");
		map.put(4,"Kiwi");
		
		System.out.println("Iterating Hashmap...");
		System.out.println("key"+" "+"Value");
		for(java.util.Map.Entry<Integer, String> m :map.entrySet())
		{
		System.out.println(" "+m.getKey()+"    "+m.getValue());
	}

}
	public static void main(String[] args) {
		HashMapEx1 hm=new HashMapEx1();
		hm.HashMapDemo();
		
	}
}
