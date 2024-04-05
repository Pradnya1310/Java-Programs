package Thread;

public class PrintTable {
	 public void print(int n) {
		 synchronized (this) {
			 for(int i=1;i<=10;i++) {
				 try {
					 Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				 System.out.println(i*n);
			 }
		 }
	 }

}
class Thread1 extends Thread{
	PrintTable printTable;
	
	public Thread1(PrintTable printTable) {
		this.printTable=printTable;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		printTable.print(5);
	}

}
class Thread2 extends Thread{
	PrintTable printTable;
	
	public Thread2(PrintTable printTable) {
		this.printTable=printTable;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		printTable.print(4);
	}
}
