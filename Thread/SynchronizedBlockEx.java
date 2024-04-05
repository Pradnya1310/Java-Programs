package Thread;

public class SynchronizedBlockEx {

		public static void main(String[] args) {
			
		    PrintTable printTable=new PrintTable();
		    Thread1 thread1=new Thread1(printTable);
		    Thread2 thread2=new Thread2(printTable);
		    thread1.start();
		    thread2.start();
		    
			}
}

