package ClassandObject;

public class PrimeNumberMethodEx {
	int n=17;
	boolean b=false;
	
	public void primenum() {
		for(int i=2;i<n/2;i++) 
		{
			if(n%i==0)
			{
				b=true;
				break;
	
		}
	
}
	if(b==true) 
	{
		System.out.println("not prime");
		
		}
	else
	{
		System.out.println("prime");
	}
}
	public static void main(String[] args) {
		PrimeNumberMethodEx primenummethodex=new PrimeNumberMethodEx();
		primenummethodex.primenum();
		
	}
	

}
