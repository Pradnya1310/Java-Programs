package Thread;

public class MyThread1 extends Thread{
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("excecuting thread: "+getName());
		}
	}
	public static void main(String[] args) {
		MyThread1 thread1=new MyThread1();
		thread1.setName("Thread1");
		thread1.start();
		
		MyThread1 thread2=new MyThread1();
		thread2.setName("Thread 2");
		thread2.start();
		
		
	}

}
