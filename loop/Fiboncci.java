package loop;

public class Fiboncci {

	public static void main(String[] args) {
	 int n=10,fno=0,sno=1,tno;
	 System.out.println("Enter Fibonacci Series");
	
	 
	 for(int i=1;i<=n;i++);
			 { 
				 System.out.println(fno+",");
				  
				 tno=fno+sno;
				 fno=sno;
				 sno=fno;
				 
				 
				 
			 }
	 

	}

}
