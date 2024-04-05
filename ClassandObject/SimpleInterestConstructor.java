package ClassandObject;

public class SimpleInterestConstructor {
	double principleAmt, rate, years;
    
	public SimpleInterestConstructor()//default
			{
				principleAmt=25000;
				rate=6.7;
				years=2;
				
						
	}
	public SimpleInterestConstructor(double principleAmt, double rate,double years)
	{
		this.principleAmt=principleAmt;
		this.rate=rate;
		this.years=years;
		
	}
    public void calculate() 
    {
    	System.out.println("SimpleInterest="+principleAmt*rate*years); 
    	}
    public static void main(String[] args)
    {
		
    	SimpleInterestConstructor s1=new SimpleInterestConstructor();
    	s1.calculate();
    }
}




