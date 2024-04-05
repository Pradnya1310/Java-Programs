package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>();
		queue.add("Jasmin");
		queue.add("Lotus");
		queue.add("Rose");
		queue.add("Mogra");
		queue.add("Lilly");
		
		System.out.println("Queue : "+queue);
		
		System.out.println("head of queue: "+queue.element());
		
		System.out.println("removing element: "+queue.remove());
		
		System.out.println("after removing Queue: "+queue);
		
		System.out.println("removing element: "+queue.poll());
		
		System.out.println("after removing Queue: "+queue);
	}

}
