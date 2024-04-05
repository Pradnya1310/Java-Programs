package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
	public static void main(String[] args) {
		Deque<String> deque=new ArrayDeque<>();
		deque.add("Coffee");
		deque.offer("Tea");
		deque.offer("Ice-Cream");
		deque.offer("Sandwitch");
		deque.offer("Pizza");
		deque.offer("Burger");
		//deque.offer(null); you can't insert null
		
		System.out.println("Deque: "+deque);
		
		System.out.println("removing 1st element:"+deque.pollFirst());
		
		System.out.println("Deque: "+deque);
		
		System.out.println("removing 1st element:"+deque.pollFirst());
		
		System.out.println("Deque: "+deque);
		
		System.out.println("head of queue:"+deque.peek());




		
	}

}
